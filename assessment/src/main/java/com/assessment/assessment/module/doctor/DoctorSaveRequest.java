package com.assessment.assessment.module.doctor;

import lombok.Builder;

@Builder
public record DoctorSaveRequest(
        String name,
        Long specializationId
) {
}
