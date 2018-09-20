package com.example.springbootjpa.servicce.impl;

import com.example.springbootjpa.DAO.StudentRepository;
import com.example.springbootjpa.entity.Student;
import com.example.springbootjpa.servicce.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentRepository studentRepository;

    @Override
    @Transactional
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    @Transactional
    public void delete(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    @Transactional
    public Student get(int id) {
        return studentRepository.findById(id).get();
    }
}

