package com.example.oidtypeconversion;

import org.hibernate.type.descriptor.jdbc.BinaryJdbcType;
import org.hibernate.type.descriptor.jdbc.JdbcType;
import org.hibernate.type.descriptor.jdbc.JsonJdbcType;
import org.hibernate.usertype.UserTypeSupport;

public class ByteaUserType extends UserTypeSupport<byte[]> {

    static final JdbcType SQL_TYPE = BinaryJdbcType.INSTANCE;

    public ByteaUserType() {
        super(byte[].class, SQL_TYPE.getJdbcTypeCode());
    }

}
