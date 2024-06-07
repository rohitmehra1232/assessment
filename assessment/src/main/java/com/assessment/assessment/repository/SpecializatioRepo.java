package com.assessment.assessment.repository;

import com.assessment.assessment.database.Tables;
import com.assessment.assessment.database.tables.daos.IqSpecializationDoctorMappingDao;
import com.assessment.assessment.database.tables.records.IqDoctorRecord;
import com.assessment.assessment.database.tables.records.IqSpecializationDoctorMappingRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static com.assessment.assessment.database.Tables.IQ_DOCTOR;
import static com.assessment.assessment.database.Tables.IQ_SPECIALIZATION_DOCTOR_MAPPING;

@Repository
public class SpecializatioRepo extends IqSpecializationDoctorMappingDao {
    private final DSLContext context;


    public SpecializatioRepo(DSLContext context) {
        super(context.configuration());
        this.context = context;
    }

    public IqSpecializationDoctorMappingRecord updateSpecialization(Long id, Integer clientId) {
        IqSpecializationDoctorMappingRecord record = this.context.selectFrom(IQ_SPECIALIZATION_DOCTOR_MAPPING)
                .where(IQ_SPECIALIZATION_DOCTOR_MAPPING.CLIENT_ID.eq(clientId).and(IQ_SPECIALIZATION_DOCTOR_MAPPING.ID.eq(id)))
                .fetchOne();

        return record;
    }
}
