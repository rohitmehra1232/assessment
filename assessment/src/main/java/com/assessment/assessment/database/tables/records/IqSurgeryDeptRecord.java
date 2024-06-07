/*
 * This file is generated by jOOQ.
 */
package com.assessment.assessment.database.tables.records;


import com.assessment.assessment.database.tables.IqSurgeryDept;

import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IqSurgeryDeptRecord extends UpdatableRecordImpl<IqSurgeryDeptRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>iq_surgery_dept.id</code>.
     */
    public IqSurgeryDeptRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>iq_surgery_dept.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>iq_surgery_dept.surgery_name</code>.
     */
    public IqSurgeryDeptRecord setSurgeryName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>iq_surgery_dept.surgery_name</code>.
     */
    public String getSurgeryName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>iq_surgery_dept.due_date</code>.
     */
    public IqSurgeryDeptRecord setDueDate(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>iq_surgery_dept.due_date</code>.
     */
    public LocalDateTime getDueDate() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>iq_surgery_dept.updated_on</code>.
     */
    public IqSurgeryDeptRecord setUpdatedOn(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>iq_surgery_dept.updated_on</code>.
     */
    public LocalDateTime getUpdatedOn() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>iq_surgery_dept.updated_by</code>.
     */
    public IqSurgeryDeptRecord setUpdatedBy(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>iq_surgery_dept.updated_by</code>.
     */
    public Long getUpdatedBy() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>iq_surgery_dept.is_deleted</code>.
     */
    public IqSurgeryDeptRecord setIsDeleted(Boolean value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>iq_surgery_dept.is_deleted</code>.
     */
    public Boolean getIsDeleted() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>iq_surgery_dept.deleted_on</code>.
     */
    public IqSurgeryDeptRecord setDeletedOn(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>iq_surgery_dept.deleted_on</code>.
     */
    public LocalDateTime getDeletedOn() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>iq_surgery_dept.deleted_by</code>.
     */
    public IqSurgeryDeptRecord setDeletedBy(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>iq_surgery_dept.deleted_by</code>.
     */
    public Long getDeletedBy() {
        return (Long) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IqSurgeryDeptRecord
     */
    public IqSurgeryDeptRecord() {
        super(IqSurgeryDept.IQ_SURGERY_DEPT);
    }

    /**
     * Create a detached, initialised IqSurgeryDeptRecord
     */
    public IqSurgeryDeptRecord(Long id, String surgeryName, LocalDateTime dueDate, LocalDateTime updatedOn, Long updatedBy, Boolean isDeleted, LocalDateTime deletedOn, Long deletedBy) {
        super(IqSurgeryDept.IQ_SURGERY_DEPT);

        setId(id);
        setSurgeryName(surgeryName);
        setDueDate(dueDate);
        setUpdatedOn(updatedOn);
        setUpdatedBy(updatedBy);
        setIsDeleted(isDeleted);
        setDeletedOn(deletedOn);
        setDeletedBy(deletedBy);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised IqSurgeryDeptRecord
     */
    public IqSurgeryDeptRecord(com.assessment.assessment.database.tables.pojos.IqSurgeryDept value) {
        super(IqSurgeryDept.IQ_SURGERY_DEPT);

        if (value != null) {
            setId(value.getId());
            setSurgeryName(value.getSurgeryName());
            setDueDate(value.getDueDate());
            setUpdatedOn(value.getUpdatedOn());
            setUpdatedBy(value.getUpdatedBy());
            setIsDeleted(value.getIsDeleted());
            setDeletedOn(value.getDeletedOn());
            setDeletedBy(value.getDeletedBy());
            resetChangedOnNotNull();
        }
    }
}
