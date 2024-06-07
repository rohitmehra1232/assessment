package com.assessment.assessment.controllers;

import com.assessment.assessment.module.doctor.DoctorModel;
import com.assessment.assessment.module.doctor.DoctorSaveRequest;
import com.assessment.assessment.module.patient.PatientModel;
import com.assessment.assessment.service.DoctorService;
import com.assessment.assessment.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/patient")
public class patientController {
    private  final PatientService patientService;

    @PostMapping("/save")
    public String save(@RequestBody PatientModel request){
        patientService.saveDetail(request);
        return "created!";
    }

}
