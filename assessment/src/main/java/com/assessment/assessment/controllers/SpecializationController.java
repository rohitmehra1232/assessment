package com.assessment.assessment.controllers;


import com.assessment.assessment.module.specilization.SpecilizationResponse;
import com.assessment.assessment.service.SpecializationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/specialization")
public class SpecializationController {
    private  final SpecializationService specializationService;

    @PostMapping("/save")
    public String saveSpecialization(@RequestBody SpecilizationResponse request){
        specializationService.saveSpecialization(request);
        return "created!";
    }

//    @GetMapping("/")
//    public DoctorModel getDoctorDetails(){
//        return specializationService.getDetails();
//    }

    @PutMapping("/{id}")
    public String updateSpecialization( @PathVariable Long id,@RequestBody SpecilizationResponse request){
        specializationService.updateSpecialization(id,request);
        return "update";
    }


//    @DeleteMapping("/{doctor-id}")
//    public String deleteDoctorDetail( @PathVariable Long id){
//        specializationService.deleteDoctorDetail(id);
//        return "deleted!";
//    }
}
