package com.assessment.assessment.service;

import com.assessment.assessment.Common.Utils;
import com.assessment.assessment.database.Tables;
import com.assessment.assessment.database.tables.records.IqSpecializationDoctorMappingRecord;
import com.assessment.assessment.module.specilization.SpecilizationResponse;
import com.assessment.assessment.repository.SpecializatioRepo;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class SpecializationService {
    private final SpecializatioRepo specializatioRepo;
    private final DSLContext context;
    private final Utils utils;

    public void saveSpecialization(SpecilizationResponse request) {

        IqSpecializationDoctorMappingRecord record =  this.context.newRecord(Tables.IQ_SPECIALIZATION_DOCTOR_MAPPING);
        record.setDoctorId(request.doctorId());
        record.setSpecializationId(request.specializationId());
        record.setClientId(utils.getClientId());
        record.setCreatedOn(LocalDateTime.now());
        record.setCreatedBy(utils.getUserId());
        record.store();
    }

    public void updateSpecialization(Long id, SpecilizationResponse request) {
        IqSpecializationDoctorMappingRecord record = specializatioRepo.updateSpecialization(id,utils.getClientId());
        record.setDoctorId(request.doctorId());
        record.setSpecializationId(request.specializationId());
        record.setClientId(utils.getClientId());
        record.setUpdatedBy(utils.getUserId());
        record.setUpdatedOn(LocalDateTime.now());
        record.update();
    }
}
