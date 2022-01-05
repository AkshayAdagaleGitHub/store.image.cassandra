package com.example.cassandra.store.image.cassandra.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.nio.ByteBuffer;
import java.sql.Blob;
import java.util.UUID;

//@Table
@Data
@NoArgsConstructor
public class Image {

    @PrimaryKey
    private UUID id;

    ByteBuffer image;
}
