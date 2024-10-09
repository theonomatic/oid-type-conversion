package com.example.oidtypeconversion;

import org.hibernate.type.descriptor.jdbc.BinaryJdbcType;
import org.hibernate.type.descriptor.jdbc.JdbcType;
import org.hibernate.type.descriptor.jdbc.JsonAsStringJdbcType;

import org.hibernate.usertype.UserTypeSupport;

public class JsonStringUserType extends UserTypeSupport<String> {

    private static final JdbcType JDBC_TYPE = JsonAsStringJdbcType.INSTANCE;

    public JsonStringUserType() {
        super(String.class, JDBC_TYPE.getJdbcTypeCode());
    }

}
