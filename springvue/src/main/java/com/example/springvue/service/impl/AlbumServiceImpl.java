package com.example.springvue.service.impl;

import com.example.springvue.dao.AlbumRepository;
import com.example.springvue.entity.Album;
import com.example.springvue.service.AlbumService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AlbumServiceImpl implements AlbumService {
    @Resource
    private AlbumRepository albumRepository;

    @Override
    public List<Album> getHotAlbums() {
        return albumRepository.findHotAlbums();
    }

    @Override
    public Album findOne(Integer id) {
        return albumRepository.findById(id).get();
    }
}