package com.example.springbootjpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author asus
 */
@Entity
@Data
public class Book implements Serializable{
    @Id
    @GeneratedValue
    private long id;

    private String bookName;

    private String bookAuther;

    private String bookIntroduce;

    private String bookCover;

}
