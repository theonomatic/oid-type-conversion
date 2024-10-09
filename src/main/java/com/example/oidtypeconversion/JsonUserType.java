package com.example.oidtypeconversion;

import org.hibernate.type.descriptor.jdbc.JdbcType;
import org.hibernate.type.descriptor.jdbc.JsonJdbcType;
import org.hibernate.usertype.UserTypeSupport;

public class JsonUserType extends UserTypeSupport<byte[]> {

    static final JdbcType SQL_TYPE = JsonJdbcType.INSTANCE;

    public JsonUserType() {
        super(byte[].class, SQL_TYPE.getJdbcTypeCode());
    }

}
