package com.example.springbootjpa.servicce.impl;

import com.example.springbootjpa.DAO.BookRepository;
import com.example.springbootjpa.entity.Book;
import com.example.springbootjpa.servicce.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author asus
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).get();
    }
}