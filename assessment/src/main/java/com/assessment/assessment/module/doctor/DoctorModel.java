package com.assessment.assessment.module.doctor;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record DoctorModel(
        String name,
        Long specialization,
        String createdBy,
        String updatedBy,
        LocalDateTime createdOn,
        LocalDateTime updatedOn

) {
}
