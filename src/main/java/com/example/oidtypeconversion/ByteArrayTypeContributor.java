package com.example.oidtypeconversion;

import org.hibernate.boot.model.TypeContributions;
import org.hibernate.boot.model.TypeContributor;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.BasicType;
import org.hibernate.type.descriptor.java.PrimitiveByteArrayJavaType;
import org.hibernate.type.descriptor.jdbc.BinaryJdbcType;
import org.hibernate.type.descriptor.jdbc.VarbinaryJdbcType;

public class ByteArrayTypeContributor implements TypeContributor {
    @Override
    public void contribute(TypeContributions typeContributions, ServiceRegistry serviceRegistry) {
//        BasicType<?> byteArrayType = new BasicType<>(
//                BinaryJdbcType.INSTANCE,
//                PrimitiveByteArrayJavaType.INSTANCE);
//        typeContributions.contributeType(byteArrayType, byte[].class.getName());
    }

}
