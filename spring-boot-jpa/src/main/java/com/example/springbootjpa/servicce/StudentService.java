package com.example.springbootjpa.servicce;


import com.example.springbootjpa.entity.Student;

import java.util.List;

/**
 * @author asus
 */
public interface StudentService {
    Student save(Student student);
    /**
     * 新增學生
     * @return
     */
    List<Student> getAll();
    /**
     *
     * @param id
     * @return
     */
    Student get(int id) ;

    void delete(int id) ;
}


