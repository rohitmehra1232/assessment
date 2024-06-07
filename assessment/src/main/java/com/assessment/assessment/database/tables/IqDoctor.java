/*
 * This file is generated by jOOQ.
 */
package com.assessment.assessment.database.tables;


import com.assessment.assessment.database.DefaultSchema;
import com.assessment.assessment.database.Keys;
import com.assessment.assessment.database.tables.records.IqDoctorRecord;

import java.time.LocalDateTime;
import java.util.Collection;

import org.jooq.Condition;
import org.jooq.Field;
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
public class IqDoctor extends TableImpl<IqDoctorRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>iq_doctor</code>
     */
    public static final IqDoctor IQ_DOCTOR = new IqDoctor();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IqDoctorRecord> getRecordType() {
        return IqDoctorRecord.class;
    }

    /**
     * The column <code>iq_doctor.id</code>.
     */
    public final TableField<IqDoctorRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>iq_doctor.client_id</code>.
     */
    public final TableField<IqDoctorRecord, Integer> CLIENT_ID = createField(DSL.name("client_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>iq_doctor.name</code>.
     */
    public final TableField<IqDoctorRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>iq_doctor.specialization_id</code>.
     */
    public final TableField<IqDoctorRecord, Long> SPECIALIZATION_ID = createField(DSL.name("specialization_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>iq_doctor.is_deleted</code>.
     */
    public final TableField<IqDoctorRecord, Boolean> IS_DELETED = createField(DSL.name("is_deleted"), SQLDataType.BIT, this, "");

    /**
     * The column <code>iq_doctor.created_on</code>.
     */
    public final TableField<IqDoctorRecord, LocalDateTime> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>iq_doctor.created_by</code>.
     */
    public final TableField<IqDoctorRecord, Long> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>iq_doctor.updated_on</code>.
     */
    public final TableField<IqDoctorRecord, LocalDateTime> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>iq_doctor.updated_by</code>.
     */
    public final TableField<IqDoctorRecord, Long> UPDATED_BY = createField(DSL.name("updated_by"), SQLDataType.BIGINT, this, "");

    private IqDoctor(Name alias, Table<IqDoctorRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private IqDoctor(Name alias, Table<IqDoctorRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>iq_doctor</code> table reference
     */
    public IqDoctor(String alias) {
        this(DSL.name(alias), IQ_DOCTOR);
    }

    /**
     * Create an aliased <code>iq_doctor</code> table reference
     */
    public IqDoctor(Name alias) {
        this(alias, IQ_DOCTOR);
    }

    /**
     * Create a <code>iq_doctor</code> table reference
     */
    public IqDoctor() {
        this(DSL.name("iq_doctor"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<IqDoctorRecord> getPrimaryKey() {
        return Keys.KEY_IQ_DOCTOR_PRIMARY;
    }

    @Override
    public IqDoctor as(String alias) {
        return new IqDoctor(DSL.name(alias), this);
    }

    @Override
    public IqDoctor as(Name alias) {
        return new IqDoctor(alias, this);
    }

    @Override
    public IqDoctor as(Table<?> alias) {
        return new IqDoctor(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public IqDoctor rename(String name) {
        return new IqDoctor(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IqDoctor rename(Name name) {
        return new IqDoctor(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public IqDoctor rename(Table<?> name) {
        return new IqDoctor(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public IqDoctor where(Condition condition) {
        return new IqDoctor(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public IqDoctor where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public IqDoctor where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public IqDoctor where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public IqDoctor where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public IqDoctor where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public IqDoctor where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public IqDoctor where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public IqDoctor whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public IqDoctor whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
