/*
 * This file is generated by jOOQ.
 */
package com.assessment.assessment.database.tables;


import com.assessment.assessment.database.DefaultSchema;
import com.assessment.assessment.database.Keys;
import com.assessment.assessment.database.tables.records.IqSpecializationMasterRecord;

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
public class IqSpecializationMaster extends TableImpl<IqSpecializationMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>iq_specialization_master</code>
     */
    public static final IqSpecializationMaster IQ_SPECIALIZATION_MASTER = new IqSpecializationMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IqSpecializationMasterRecord> getRecordType() {
        return IqSpecializationMasterRecord.class;
    }

    /**
     * The column <code>iq_specialization_master.id</code>.
     */
    public final TableField<IqSpecializationMasterRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>iq_specialization_master.title</code>.
     */
    public final TableField<IqSpecializationMasterRecord, String> TITLE = createField(DSL.name("title"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>iq_specialization_master.des</code>.
     */
    public final TableField<IqSpecializationMasterRecord, String> DES = createField(DSL.name("des"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>iq_specialization_master.client_id</code>.
     */
    public final TableField<IqSpecializationMasterRecord, Integer> CLIENT_ID = createField(DSL.name("client_id"), SQLDataType.INTEGER, this, "");

    private IqSpecializationMaster(Name alias, Table<IqSpecializationMasterRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private IqSpecializationMaster(Name alias, Table<IqSpecializationMasterRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>iq_specialization_master</code> table reference
     */
    public IqSpecializationMaster(String alias) {
        this(DSL.name(alias), IQ_SPECIALIZATION_MASTER);
    }

    /**
     * Create an aliased <code>iq_specialization_master</code> table reference
     */
    public IqSpecializationMaster(Name alias) {
        this(alias, IQ_SPECIALIZATION_MASTER);
    }

    /**
     * Create a <code>iq_specialization_master</code> table reference
     */
    public IqSpecializationMaster() {
        this(DSL.name("iq_specialization_master"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<IqSpecializationMasterRecord> getPrimaryKey() {
        return Keys.KEY_IQ_SPECIALIZATION_MASTER_PRIMARY;
    }

    @Override
    public IqSpecializationMaster as(String alias) {
        return new IqSpecializationMaster(DSL.name(alias), this);
    }

    @Override
    public IqSpecializationMaster as(Name alias) {
        return new IqSpecializationMaster(alias, this);
    }

    @Override
    public IqSpecializationMaster as(Table<?> alias) {
        return new IqSpecializationMaster(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public IqSpecializationMaster rename(String name) {
        return new IqSpecializationMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IqSpecializationMaster rename(Name name) {
        return new IqSpecializationMaster(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public IqSpecializationMaster rename(Table<?> name) {
        return new IqSpecializationMaster(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public IqSpecializationMaster where(Condition condition) {
        return new IqSpecializationMaster(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public IqSpecializationMaster where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public IqSpecializationMaster where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public IqSpecializationMaster where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public IqSpecializationMaster where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public IqSpecializationMaster where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public IqSpecializationMaster where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public IqSpecializationMaster where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public IqSpecializationMaster whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public IqSpecializationMaster whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}