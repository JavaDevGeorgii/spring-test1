package com.levelup.spring.service.impl;

import com.levelup.spring.dao.StudentRepository;
import com.levelup.spring.model.Student;
import com.levelup.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by GEO on 10.03.15.
 */
@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentServiceImpl(Student student) {
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.getAllStudents();
    }

    public StudentServiceImpl(){

    }
}
