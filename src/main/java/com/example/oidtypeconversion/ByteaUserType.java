package com.example.oidtypeconversion;

import com.fasterxml.jackson.databind.JsonNode;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.type.SqlTypes;
import org.hibernate.type.descriptor.jdbc.BinaryJdbcType;
import org.hibernate.type.descriptor.jdbc.JdbcType;
import org.hibernate.type.descriptor.jdbc.JsonJdbcType;
import org.hibernate.usertype.UserTypeSupport;

import java.nio.charset.StandardCharsets;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ByteaUserType extends UserTypeSupport<byte[]> {


    static final int SQL_TYPE = SqlTypes.BINARY;

    public ByteaUserType() {
        super(JsonNode.class, SQL_TYPE);
    }

    @Override
    public byte[] nullSafeGet(ResultSet rs, int position, SharedSessionContractImplementor session, Object owner) throws SQLException {
        return rs.getString(position).getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public void nullSafeSet(PreparedStatement st, byte[] value, int index, SharedSessionContractImplementor session) throws SQLException {
        if (value == null) {
            st.setNull(index, SQL_TYPE);
        } else {
            st.setObject(index, new String(value, StandardCharsets.UTF_8), SQL_TYPE);
        }
    }

}
