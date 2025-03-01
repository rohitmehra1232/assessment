/*
 * This file is generated by jOOQ.
 */
package com.assessment.assessment.database.tables.daos;


import com.assessment.assessment.database.tables.IqDoctor;
import com.assessment.assessment.database.tables.records.IqDoctorRecord;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IqDoctorDao extends DAOImpl<IqDoctorRecord, com.assessment.assessment.database.tables.pojos.IqDoctor, Long> {

    /**
     * Create a new IqDoctorDao without any configuration
     */
    public IqDoctorDao() {
        super(IqDoctor.IQ_DOCTOR, com.assessment.assessment.database.tables.pojos.IqDoctor.class);
    }

    /**
     * Create a new IqDoctorDao with an attached configuration
     */
    public IqDoctorDao(Configuration configuration) {
        super(IqDoctor.IQ_DOCTOR, com.assessment.assessment.database.tables.pojos.IqDoctor.class, configuration);
    }

    @Override
    public Long getId(com.assessment.assessment.database.tables.pojos.IqDoctor object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqDoctor> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(IqDoctor.IQ_DOCTOR.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqDoctor> fetchById(Long... values) {
        return fetch(IqDoctor.IQ_DOCTOR.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.assessment.assessment.database.tables.pojos.IqDoctor fetchOneById(Long value) {
        return fetchOne(IqDoctor.IQ_DOCTOR.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<com.assessment.assessment.database.tables.pojos.IqDoctor> fetchOptionalById(Long value) {
        return fetchOptional(IqDoctor.IQ_DOCTOR.ID, value);
    }

    /**
     * Fetch records that have <code>client_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqDoctor> fetchRangeOfClientId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(IqDoctor.IQ_DOCTOR.CLIENT_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>client_id IN (values)</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqDoctor> fetchByClientId(Integer... values) {
        return fetch(IqDoctor.IQ_DOCTOR.CLIENT_ID, values);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqDoctor> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(IqDoctor.IQ_DOCTOR.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqDoctor> fetchByName(String... values) {
        return fetch(IqDoctor.IQ_DOCTOR.NAME, values);
    }

    /**
     * Fetch records that have <code>specialization_id BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqDoctor> fetchRangeOfSpecializationId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(IqDoctor.IQ_DOCTOR.SPECIALIZATION_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>specialization_id IN (values)</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqDoctor> fetchBySpecializationId(Long... values) {
        return fetch(IqDoctor.IQ_DOCTOR.SPECIALIZATION_ID, values);
    }

    /**
     * Fetch records that have <code>is_deleted BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqDoctor> fetchRangeOfIsDeleted(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(IqDoctor.IQ_DOCTOR.IS_DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_deleted IN (values)</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqDoctor> fetchByIsDeleted(Boolean... values) {
        return fetch(IqDoctor.IQ_DOCTOR.IS_DELETED, values);
    }

    /**
     * Fetch records that have <code>created_on BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqDoctor> fetchRangeOfCreatedOn(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(IqDoctor.IQ_DOCTOR.CREATED_ON, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>created_on IN (values)</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqDoctor> fetchByCreatedOn(LocalDateTime... values) {
        return fetch(IqDoctor.IQ_DOCTOR.CREATED_ON, values);
    }

    /**
     * Fetch records that have <code>created_by BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqDoctor> fetchRangeOfCreatedBy(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(IqDoctor.IQ_DOCTOR.CREATED_BY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>created_by IN (values)</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqDoctor> fetchByCreatedBy(Long... values) {
        return fetch(IqDoctor.IQ_DOCTOR.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>updated_on BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqDoctor> fetchRangeOfUpdatedOn(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(IqDoctor.IQ_DOCTOR.UPDATED_ON, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>updated_on IN (values)</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqDoctor> fetchByUpdatedOn(LocalDateTime... values) {
        return fetch(IqDoctor.IQ_DOCTOR.UPDATED_ON, values);
    }

    /**
     * Fetch records that have <code>updated_by BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqDoctor> fetchRangeOfUpdatedBy(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(IqDoctor.IQ_DOCTOR.UPDATED_BY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>updated_by IN (values)</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqDoctor> fetchByUpdatedBy(Long... values) {
        return fetch(IqDoctor.IQ_DOCTOR.UPDATED_BY, values);
    }
}
