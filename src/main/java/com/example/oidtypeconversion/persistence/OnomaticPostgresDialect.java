package com.example.oidtypeconversion.persistence;

import org.hibernate.boot.model.TypeContributions;
import org.hibernate.dialect.PostgreSQLDialect;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.SqlTypes;
import org.hibernate.type.descriptor.jdbc.BinaryJdbcType;

import java.sql.Types;

public class OnomaticPostgresDialect extends PostgreSQLDialect {

    @Override
    protected String columnType(int sqlTypeCode) {
        return switch (sqlTypeCode) {
            case SqlTypes.BLOB, SqlTypes.CLOB, SqlTypes.NCLOB -> "bytea";
            default -> super.columnType(sqlTypeCode);
        };
    }

    @Override
    public void contributeTypes(TypeContributions typeContributions, ServiceRegistry serviceRegistry) {
        super.contributeTypes(typeContributions, serviceRegistry);
        typeContributions.getTypeConfiguration().getJdbcTypeRegistry().addDescriptor(
                Types.BLOB,
                BinaryJdbcType.INSTANCE
        );
    }
}
