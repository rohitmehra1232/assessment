package com.assessment.assessment.service;

import com.assessment.assessment.Common.Utils;
import com.assessment.assessment.database.Tables;
import com.assessment.assessment.database.tables.records.IqDoctorRecord;
import com.assessment.assessment.module.doctor.DoctorModel;
import com.assessment.assessment.module.doctor.DoctorSaveRequest;
import com.assessment.assessment.repository.DoctorRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
@Slf4j
public class DoctorService {

    private final DoctorRepo doctorRepo;
    private final DSLContext context;
    private final  Utils utils;

    public void saveDetail(DoctorSaveRequest request) {

        IqDoctorRecord record =  this.context.newRecord(Tables.IQ_DOCTOR);
        record.setName(request.name());
        record.setClientId(utils.getClientId());
        record.setIsDeleted(false);
        record.setCreatedOn(LocalDateTime.now());
        record.setCreatedBy(utils.getUserId());
        record.store();
    }

    public DoctorModel getDetails() {
        Result<IqDoctorRecord>  records = doctorRepo.getAllDetails(utils.getClientId());

        for(IqDoctorRecord record : records){
            return DoctorModel.builder()
                    .name(record.getName())
                    .updatedOn(record.getUpdatedOn())
                    .createdOn(record.getCreatedOn())
                    .createdBy(utils.getUserName(record.getCreatedBy()))
                    .updatedBy(utils.getUserName(record.getUpdatedBy()))
                    .specialization((record.getSpecializationId()))
                    .build();
        }
        return null;
    }

    public void updateDetails(Long id, DoctorSaveRequest request) {
        IqDoctorRecord record = doctorRepo.updateDoctorDetail(id,utils.getClientId());
        record.setName(request.name());
        record.setUpdatedBy(utils.getUserId());
        record.setUpdatedOn(LocalDateTime.now());
        record.setSpecializationId(request.specializationId());
        record.update();



    }

    public void deleteDoctorDetail(Long id) {
        IqDoctorRecord record = doctorRepo.deleteDoctorDetail(id,utils.getClientId());
        record.setIsDeleted(true);
        record.update();
    }
}
