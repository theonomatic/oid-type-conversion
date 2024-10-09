package com.example.oidtypeconversion;

import org.hibernate.dialect.PostgreSQLDialect;
import org.hibernate.type.SqlTypes;

public class ByteaSQLDialect extends PostgreSQLDialect {

    @Override
    protected String columnType(int sqlTypeCode) {
        return switch (sqlTypeCode) {
            case SqlTypes.BLOB, SqlTypes.CLOB, SqlTypes.NCLOB -> "bytea";
            default -> super.columnType(sqlTypeCode);
        };
    }
}
