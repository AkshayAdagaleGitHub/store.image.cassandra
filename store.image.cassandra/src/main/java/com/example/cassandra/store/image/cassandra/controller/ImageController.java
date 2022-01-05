package com.example.cassandra.store.image.cassandra.controller;

import com.example.cassandra.store.image.cassandra.service.CassandraImageImp;
import com.example.cassandra.store.image.cassandra.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class ImageController {

  @Autowired
  ImageService imageService;

  @RequestMapping(value = "/search/{searchimage}", method = RequestMethod.GET)
   public ResponseEntity<?> saveImage(){
    imageService.saveImage();
     return ResponseEntity.ok().body("");
   }

}
