package com.example.springbootjpa.DAO;

import com.example.springbootjpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author asus
 */
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
