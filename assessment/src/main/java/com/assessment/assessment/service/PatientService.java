package com.assessment.assessment.service;

import com.assessment.assessment.database.Tables;
import com.assessment.assessment.database.tables.records.IqPatientDeptRecord;
import com.assessment.assessment.module.patient.PatientModel;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PatientService {
    private DSLContext context;

    public void saveDetail(PatientModel request) {
        IqPatientDeptRecord record =  this.context.newRecord(Tables.IQ_PATIENT_DEPT);
        record.setName(request.name());
        record.setDob(request.dob());
        record.setAddress(request.address());
        record.store();
    }
}
