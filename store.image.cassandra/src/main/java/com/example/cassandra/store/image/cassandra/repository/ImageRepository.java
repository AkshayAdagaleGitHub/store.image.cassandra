package com.example.cassandra.store.image.cassandra.repository;

import com.example.cassandra.store.image.cassandra.entity.Image;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ImageRepository extends CassandraRepository<Image, UUID> {
//    Image save(Image image);
}
