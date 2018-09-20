package com.example.springbootjpa.servicce;

import com.example.springbootjpa.entity.Book;

import java.util.List;

/**
 * @author asus
 */
public interface BookService {
    /**
     * 获取所有 Book
     */
    List<Book> findAll();


    /**
     * 获取 Book
     *
     * @param id 编号
     */
    Book findById(Long id);
}

