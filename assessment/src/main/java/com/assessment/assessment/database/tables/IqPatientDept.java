/*
 * This file is generated by jOOQ.
 */
package com.assessment.assessment.database.tables;


import com.assessment.assessment.database.DefaultSchema;
import com.assessment.assessment.database.Keys;
import com.assessment.assessment.database.tables.records.IqPatientDeptRecord;

import java.time.LocalDateTime;
import java.util.Collection;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IqPatientDept extends TableImpl<IqPatientDeptRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>iq_patient_dept</code>
     */
    public static final IqPatientDept IQ_PATIENT_DEPT = new IqPatientDept();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IqPatientDeptRecord> getRecordType() {
        return IqPatientDeptRecord.class;
    }

    /**
     * The column <code>iq_patient_dept.id</code>.
     */
    public final TableField<IqPatientDeptRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>iq_patient_dept.name</code>.
     */
    public final TableField<IqPatientDeptRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>iq_patient_dept.dob</code>.
     */
    public final TableField<IqPatientDeptRecord, LocalDateTime> DOB = createField(DSL.name("dob"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>iq_patient_dept.address</code>.
     */
    public final TableField<IqPatientDeptRecord, String> ADDRESS = createField(DSL.name("address"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>iq_patient_dept.doctor_id</code>.
     */
    public final TableField<IqPatientDeptRecord, Long> DOCTOR_ID = createField(DSL.name("doctor_id"), SQLDataType.BIGINT, this, "");

    private IqPatientDept(Name alias, Table<IqPatientDeptRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private IqPatientDept(Name alias, Table<IqPatientDeptRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>iq_patient_dept</code> table reference
     */
    public IqPatientDept(String alias) {
        this(DSL.name(alias), IQ_PATIENT_DEPT);
    }

    /**
     * Create an aliased <code>iq_patient_dept</code> table reference
     */
    public IqPatientDept(Name alias) {
        this(alias, IQ_PATIENT_DEPT);
    }

    /**
     * Create a <code>iq_patient_dept</code> table reference
     */
    public IqPatientDept() {
        this(DSL.name("iq_patient_dept"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public Identity<IqPatientDeptRecord, Long> getIdentity() {
        return (Identity<IqPatientDeptRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<IqPatientDeptRecord> getPrimaryKey() {
        return Keys.KEY_IQ_PATIENT_DEPT_PRIMARY;
    }

    @Override
    public IqPatientDept as(String alias) {
        return new IqPatientDept(DSL.name(alias), this);
    }

    @Override
    public IqPatientDept as(Name alias) {
        return new IqPatientDept(alias, this);
    }

    @Override
    public IqPatientDept as(Table<?> alias) {
        return new IqPatientDept(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public IqPatientDept rename(String name) {
        return new IqPatientDept(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IqPatientDept rename(Name name) {
        return new IqPatientDept(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public IqPatientDept rename(Table<?> name) {
        return new IqPatientDept(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public IqPatientDept where(Condition condition) {
        return new IqPatientDept(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public IqPatientDept where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public IqPatientDept where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public IqPatientDept where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public IqPatientDept where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public IqPatientDept where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public IqPatientDept where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public IqPatientDept where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public IqPatientDept whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public IqPatientDept whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
