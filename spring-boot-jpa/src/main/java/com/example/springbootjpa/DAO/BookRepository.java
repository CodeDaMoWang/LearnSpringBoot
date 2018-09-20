package com.example.springbootjpa.DAO;

import com.example.springbootjpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author asus
 */
public interface BookRepository extends JpaRepository<Book,Long> {
}
