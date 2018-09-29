package com.example.springvue.service;

import com.example.springvue.entity.Album;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbumServiceTest {

    @Resource
    private AlbumService albumService;
    @Test
    public void getHotAlbums() {
    }

    @Test
    public void findOne() {
        Album album = albumService.findOne(4);
        System.out.println(album);

    }
}