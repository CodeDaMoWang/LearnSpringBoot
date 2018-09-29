package com.example.springvue.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 相册类
 */
@Entity
@Data
public class Album  {

    @Id
    @GeneratedValue
    private Integer id;

    private String albumCover;

    private String albumTitle;


    private String albumDescription;

    private Integer likes;

    public Album(String albumCover, String albumTitle, String albumDescription, Integer likes) {
        this.albumCover = albumCover;
        this.albumTitle = albumTitle;
        this.albumDescription = albumDescription;
        this.likes = likes;
    }

    public Album() {

    }


    @OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.REMOVE)
    @JoinColumn(name = "album_id")
    private List<Photo> photos = new ArrayList<>();
}
