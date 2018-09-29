package com.example.springvue.service;

import com.example.springvue.entity.Album;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AlbumService {
    /**
     * 按相册喜欢数获取热门相册
     * @return
     */
    List<Album> getHotAlbums();

    Album findOne(Integer id);
}