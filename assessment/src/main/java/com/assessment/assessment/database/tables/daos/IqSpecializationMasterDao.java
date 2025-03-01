/*
 * This file is generated by jOOQ.
 */
package com.assessment.assessment.database.tables.daos;


import com.assessment.assessment.database.tables.IqSpecializationMaster;
import com.assessment.assessment.database.tables.records.IqSpecializationMasterRecord;

import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IqSpecializationMasterDao extends DAOImpl<IqSpecializationMasterRecord, com.assessment.assessment.database.tables.pojos.IqSpecializationMaster, Long> {

    /**
     * Create a new IqSpecializationMasterDao without any configuration
     */
    public IqSpecializationMasterDao() {
        super(IqSpecializationMaster.IQ_SPECIALIZATION_MASTER, com.assessment.assessment.database.tables.pojos.IqSpecializationMaster.class);
    }

    /**
     * Create a new IqSpecializationMasterDao with an attached configuration
     */
    public IqSpecializationMasterDao(Configuration configuration) {
        super(IqSpecializationMaster.IQ_SPECIALIZATION_MASTER, com.assessment.assessment.database.tables.pojos.IqSpecializationMaster.class, configuration);
    }

    @Override
    public Long getId(com.assessment.assessment.database.tables.pojos.IqSpecializationMaster object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqSpecializationMaster> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(IqSpecializationMaster.IQ_SPECIALIZATION_MASTER.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqSpecializationMaster> fetchById(Long... values) {
        return fetch(IqSpecializationMaster.IQ_SPECIALIZATION_MASTER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.assessment.assessment.database.tables.pojos.IqSpecializationMaster fetchOneById(Long value) {
        return fetchOne(IqSpecializationMaster.IQ_SPECIALIZATION_MASTER.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<com.assessment.assessment.database.tables.pojos.IqSpecializationMaster> fetchOptionalById(Long value) {
        return fetchOptional(IqSpecializationMaster.IQ_SPECIALIZATION_MASTER.ID, value);
    }

    /**
     * Fetch records that have <code>title BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqSpecializationMaster> fetchRangeOfTitle(String lowerInclusive, String upperInclusive) {
        return fetchRange(IqSpecializationMaster.IQ_SPECIALIZATION_MASTER.TITLE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqSpecializationMaster> fetchByTitle(String... values) {
        return fetch(IqSpecializationMaster.IQ_SPECIALIZATION_MASTER.TITLE, values);
    }

    /**
     * Fetch records that have <code>des BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqSpecializationMaster> fetchRangeOfDes(String lowerInclusive, String upperInclusive) {
        return fetchRange(IqSpecializationMaster.IQ_SPECIALIZATION_MASTER.DES, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>des IN (values)</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqSpecializationMaster> fetchByDes(String... values) {
        return fetch(IqSpecializationMaster.IQ_SPECIALIZATION_MASTER.DES, values);
    }

    /**
     * Fetch records that have <code>client_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqSpecializationMaster> fetchRangeOfClientId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(IqSpecializationMaster.IQ_SPECIALIZATION_MASTER.CLIENT_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>client_id IN (values)</code>
     */
    public List<com.assessment.assessment.database.tables.pojos.IqSpecializationMaster> fetchByClientId(Integer... values) {
        return fetch(IqSpecializationMaster.IQ_SPECIALIZATION_MASTER.CLIENT_ID, values);
    }
}
