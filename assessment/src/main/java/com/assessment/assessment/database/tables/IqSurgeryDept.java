/*
 * This file is generated by jOOQ.
 */
package com.assessment.assessment.database.tables;


import com.assessment.assessment.database.DefaultSchema;
import com.assessment.assessment.database.Keys;
import com.assessment.assessment.database.tables.records.IqSurgeryDeptRecord;

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
public class IqSurgeryDept extends TableImpl<IqSurgeryDeptRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>iq_surgery_dept</code>
     */
    public static final IqSurgeryDept IQ_SURGERY_DEPT = new IqSurgeryDept();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IqSurgeryDeptRecord> getRecordType() {
        return IqSurgeryDeptRecord.class;
    }

    /**
     * The column <code>iq_surgery_dept.id</code>.
     */
    public final TableField<IqSurgeryDeptRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>iq_surgery_dept.surgery_name</code>.
     */
    public final TableField<IqSurgeryDeptRecord, String> SURGERY_NAME = createField(DSL.name("surgery_name"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>iq_surgery_dept.due_date</code>.
     */
    public final TableField<IqSurgeryDeptRecord, LocalDateTime> DUE_DATE = createField(DSL.name("due_date"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>iq_surgery_dept.updated_on</code>.
     */
    public final TableField<IqSurgeryDeptRecord, LocalDateTime> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>iq_surgery_dept.updated_by</code>.
     */
    public final TableField<IqSurgeryDeptRecord, Long> UPDATED_BY = createField(DSL.name("updated_by"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>iq_surgery_dept.is_deleted</code>.
     */
    public final TableField<IqSurgeryDeptRecord, Boolean> IS_DELETED = createField(DSL.name("is_deleted"), SQLDataType.BIT, this, "");

    /**
     * The column <code>iq_surgery_dept.deleted_on</code>.
     */
    public final TableField<IqSurgeryDeptRecord, LocalDateTime> DELETED_ON = createField(DSL.name("deleted_on"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>iq_surgery_dept.deleted_by</code>.
     */
    public final TableField<IqSurgeryDeptRecord, Long> DELETED_BY = createField(DSL.name("deleted_by"), SQLDataType.BIGINT, this, "");

    private IqSurgeryDept(Name alias, Table<IqSurgeryDeptRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private IqSurgeryDept(Name alias, Table<IqSurgeryDeptRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>iq_surgery_dept</code> table reference
     */
    public IqSurgeryDept(String alias) {
        this(DSL.name(alias), IQ_SURGERY_DEPT);
    }

    /**
     * Create an aliased <code>iq_surgery_dept</code> table reference
     */
    public IqSurgeryDept(Name alias) {
        this(alias, IQ_SURGERY_DEPT);
    }

    /**
     * Create a <code>iq_surgery_dept</code> table reference
     */
    public IqSurgeryDept() {
        this(DSL.name("iq_surgery_dept"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public Identity<IqSurgeryDeptRecord, Long> getIdentity() {
        return (Identity<IqSurgeryDeptRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<IqSurgeryDeptRecord> getPrimaryKey() {
        return Keys.KEY_IQ_SURGERY_DEPT_PRIMARY;
    }

    @Override
    public IqSurgeryDept as(String alias) {
        return new IqSurgeryDept(DSL.name(alias), this);
    }

    @Override
    public IqSurgeryDept as(Name alias) {
        return new IqSurgeryDept(alias, this);
    }

    @Override
    public IqSurgeryDept as(Table<?> alias) {
        return new IqSurgeryDept(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public IqSurgeryDept rename(String name) {
        return new IqSurgeryDept(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IqSurgeryDept rename(Name name) {
        return new IqSurgeryDept(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public IqSurgeryDept rename(Table<?> name) {
        return new IqSurgeryDept(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public IqSurgeryDept where(Condition condition) {
        return new IqSurgeryDept(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public IqSurgeryDept where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public IqSurgeryDept where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public IqSurgeryDept where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public IqSurgeryDept where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public IqSurgeryDept where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public IqSurgeryDept where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public IqSurgeryDept where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public IqSurgeryDept whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public IqSurgeryDept whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
