package com.assessment.assessment.module.patient;

import java.time.LocalDateTime;

public record PatientModel(
        String name,
        LocalDateTime dob,
        Long doctorId,
        String address
        ) {

}
