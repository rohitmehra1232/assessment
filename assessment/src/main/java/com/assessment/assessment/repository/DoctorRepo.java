package com.assessment.assessment.repository;


import com.assessment.assessment.database.tables.daos.IqDoctorDao;
import com.assessment.assessment.database.tables.records.IqDoctorRecord;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import static com.assessment.assessment.database.Tables.IQ_DOCTOR;

@Repository
@Slf4j
@Configuration
public class DoctorRepo extends IqDoctorDao {


    private final DSLContext context;

    public DoctorRepo(DSLContext context) {
        super(context.configuration());
        this.context = context;
    }


    public  Result<IqDoctorRecord>  getAllDetails(Integer clientId) {
        Result<IqDoctorRecord> record = this.context.selectFrom(IQ_DOCTOR)
                .where(IQ_DOCTOR.CLIENT_ID.eq(clientId).and(IQ_DOCTOR.IS_DELETED.eq(false)))
                .fetch();

        return record;
    }

    public IqDoctorRecord updateDoctorDetail(Long id, Integer clientId) {
        IqDoctorRecord record = this.context.selectFrom(IQ_DOCTOR)
                .where(IQ_DOCTOR.CLIENT_ID.eq(clientId).and(IQ_DOCTOR.ID.eq(id)).and(IQ_DOCTOR.IS_DELETED.eq(false)))
                .fetchOne();

        return record;
    }

    public IqDoctorRecord deleteDoctorDetail(Long id, Integer clientId) {
        IqDoctorRecord record = this.context.selectFrom(IQ_DOCTOR)
                .where(IQ_DOCTOR.CLIENT_ID.eq(clientId).and(IQ_DOCTOR.ID.eq(id)))
                .fetchOne();

        return record;
    }
}
