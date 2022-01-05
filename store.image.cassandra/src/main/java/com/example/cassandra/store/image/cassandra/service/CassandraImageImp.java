package com.example.cassandra.store.image.cassandra.service;

import com.example.cassandra.store.image.cassandra.entity.Image;
import com.example.cassandra.store.image.cassandra.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.UUID;

@Service
public class CassandraImageImp implements ImageService {

    @Autowired
    ImageRepository imageRepository;

    @Override
    public boolean saveImage() {
        FileInputStream fis= null;
        try {
            // path "C:\Users\aksha\Desktop\swagger2.png"
            fis = new FileInputStream("C://Users/aksha/Desktop/swagger2.png");
            byte[] b= new byte[fis.available()+1];
            int length=b.length;
            fis.read(b);
            ByteBuffer buffer = ByteBuffer.wrap(b);
            Image image = new Image();
            image.setId(UUID.randomUUID());
            image.setImage(buffer);
            imageRepository.save(image);
//            PreparedStatement ps = session.prepare("insert into Messages ( image, user, interaction_time,imagelength) values(?,?,?,?)");
//            BoundStatement boundStatement = new BoundStatement(ps);
//            session.execute(  boundStatement.bind( buffer, "Andy",  convertor.getTimeUUID(),length));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean getImage() {
        System.out.println(imageRepository.findAll());
        return false;
    }
}
