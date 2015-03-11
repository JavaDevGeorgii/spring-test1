package com.levelup.spring.dao.impl;

import com.levelup.spring.dao.StudentRepository;
import com.levelup.spring.dao.mapper.StudentRowMapper;
import com.levelup.spring.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by GEO on 10.03.15.
 */

@Repository("studentRepositoryTest")
public class StudentRepositoryTest  implements StudentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public List<Student> getAllStudents() {
        List<Student> students=jdbcTemplate.query("SELECT * FROM Student", new StudentRowMapper());
        System.out.println("Query выборки студентов работает");
        return students;
    }
}
