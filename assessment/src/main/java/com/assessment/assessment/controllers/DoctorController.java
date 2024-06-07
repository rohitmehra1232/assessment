package com.assessment.assessment.controllers;


import com.assessment.assessment.module.doctor.DoctorModel;
import com.assessment.assessment.module.doctor.DoctorSaveRequest;
import com.assessment.assessment.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/doctor")
public class DoctorController {
     private  final DoctorService doctorService;

     @PostMapping("/save")
    public String saveDoctorDetail(@RequestBody DoctorSaveRequest request){
        doctorService.saveDetail(request);
        return "created!";
    }

    @GetMapping("/")
    public DoctorModel getDoctorDetails(){
       return doctorService.getDetails();
    }

    @PutMapping("/{doctor-id}")
    public String updateDoctorDetails( @PathVariable Long id,@RequestBody DoctorSaveRequest request){
        doctorService.updateDetails(id,request);
        return "update";
    }


    @DeleteMapping("/{doctor-id}")
    public String deleteDoctorDetail( @PathVariable Long id){
        doctorService.deleteDoctorDetail(id);
        return "deleted!";
    }
}
