package com.example.cassandra.store.image.cassandra.service;

import com.example.cassandra.store.image.cassandra.entity.Image;


public interface ImageService {
    boolean saveImage();
    boolean getImage();
}
