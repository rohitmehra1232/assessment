/*
 * This file is generated by jOOQ.
 */
package com.assessment.assessment.database.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IqSurgeryDept implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String surgeryName;
    private LocalDateTime dueDate;
    private LocalDateTime updatedOn;
    private Long updatedBy;
    private Boolean isDeleted;
    private LocalDateTime deletedOn;
    private Long deletedBy;

    public IqSurgeryDept() {}

    public IqSurgeryDept(IqSurgeryDept value) {
        this.id = value.id;
        this.surgeryName = value.surgeryName;
        this.dueDate = value.dueDate;
        this.updatedOn = value.updatedOn;
        this.updatedBy = value.updatedBy;
        this.isDeleted = value.isDeleted;
        this.deletedOn = value.deletedOn;
        this.deletedBy = value.deletedBy;
    }

    public IqSurgeryDept(
        Long id,
        String surgeryName,
        LocalDateTime dueDate,
        LocalDateTime updatedOn,
        Long updatedBy,
        Boolean isDeleted,
        LocalDateTime deletedOn,
        Long deletedBy
    ) {
        this.id = id;
        this.surgeryName = surgeryName;
        this.dueDate = dueDate;
        this.updatedOn = updatedOn;
        this.updatedBy = updatedBy;
        this.isDeleted = isDeleted;
        this.deletedOn = deletedOn;
        this.deletedBy = deletedBy;
    }

    /**
     * Getter for <code>iq_surgery_dept.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>iq_surgery_dept.id</code>.
     */
    public IqSurgeryDept setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>iq_surgery_dept.surgery_name</code>.
     */
    public String getSurgeryName() {
        return this.surgeryName;
    }

    /**
     * Setter for <code>iq_surgery_dept.surgery_name</code>.
     */
    public IqSurgeryDept setSurgeryName(String surgeryName) {
        this.surgeryName = surgeryName;
        return this;
    }

    /**
     * Getter for <code>iq_surgery_dept.due_date</code>.
     */
    public LocalDateTime getDueDate() {
        return this.dueDate;
    }

    /**
     * Setter for <code>iq_surgery_dept.due_date</code>.
     */
    public IqSurgeryDept setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * Getter for <code>iq_surgery_dept.updated_on</code>.
     */
    public LocalDateTime getUpdatedOn() {
        return this.updatedOn;
    }

    /**
     * Setter for <code>iq_surgery_dept.updated_on</code>.
     */
    public IqSurgeryDept setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
        return this;
    }

    /**
     * Getter for <code>iq_surgery_dept.updated_by</code>.
     */
    public Long getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>iq_surgery_dept.updated_by</code>.
     */
    public IqSurgeryDept setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * Getter for <code>iq_surgery_dept.is_deleted</code>.
     */
    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    /**
     * Setter for <code>iq_surgery_dept.is_deleted</code>.
     */
    public IqSurgeryDept setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    /**
     * Getter for <code>iq_surgery_dept.deleted_on</code>.
     */
    public LocalDateTime getDeletedOn() {
        return this.deletedOn;
    }

    /**
     * Setter for <code>iq_surgery_dept.deleted_on</code>.
     */
    public IqSurgeryDept setDeletedOn(LocalDateTime deletedOn) {
        this.deletedOn = deletedOn;
        return this;
    }

    /**
     * Getter for <code>iq_surgery_dept.deleted_by</code>.
     */
    public Long getDeletedBy() {
        return this.deletedBy;
    }

    /**
     * Setter for <code>iq_surgery_dept.deleted_by</code>.
     */
    public IqSurgeryDept setDeletedBy(Long deletedBy) {
        this.deletedBy = deletedBy;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final IqSurgeryDept other = (IqSurgeryDept) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.surgeryName == null) {
            if (other.surgeryName != null)
                return false;
        }
        else if (!this.surgeryName.equals(other.surgeryName))
            return false;
        if (this.dueDate == null) {
            if (other.dueDate != null)
                return false;
        }
        else if (!this.dueDate.equals(other.dueDate))
            return false;
        if (this.updatedOn == null) {
            if (other.updatedOn != null)
                return false;
        }
        else if (!this.updatedOn.equals(other.updatedOn))
            return false;
        if (this.updatedBy == null) {
            if (other.updatedBy != null)
                return false;
        }
        else if (!this.updatedBy.equals(other.updatedBy))
            return false;
        if (this.isDeleted == null) {
            if (other.isDeleted != null)
                return false;
        }
        else if (!this.isDeleted.equals(other.isDeleted))
            return false;
        if (this.deletedOn == null) {
            if (other.deletedOn != null)
                return false;
        }
        else if (!this.deletedOn.equals(other.deletedOn))
            return false;
        if (this.deletedBy == null) {
            if (other.deletedBy != null)
                return false;
        }
        else if (!this.deletedBy.equals(other.deletedBy))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.surgeryName == null) ? 0 : this.surgeryName.hashCode());
        result = prime * result + ((this.dueDate == null) ? 0 : this.dueDate.hashCode());
        result = prime * result + ((this.updatedOn == null) ? 0 : this.updatedOn.hashCode());
        result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
        result = prime * result + ((this.isDeleted == null) ? 0 : this.isDeleted.hashCode());
        result = prime * result + ((this.deletedOn == null) ? 0 : this.deletedOn.hashCode());
        result = prime * result + ((this.deletedBy == null) ? 0 : this.deletedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("IqSurgeryDept (");

        sb.append(id);
        sb.append(", ").append(surgeryName);
        sb.append(", ").append(dueDate);
        sb.append(", ").append(updatedOn);
        sb.append(", ").append(updatedBy);
        sb.append(", ").append(isDeleted);
        sb.append(", ").append(deletedOn);
        sb.append(", ").append(deletedBy);

        sb.append(")");
        return sb.toString();
    }
}
