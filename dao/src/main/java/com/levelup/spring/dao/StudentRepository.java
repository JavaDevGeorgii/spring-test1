package com.levelup.spring.dao;

import com.levelup.spring.model.Student;
import java.util.List;

/**
 * Created by GEO on 10.03.15.
 */
public interface StudentRepository {

    List<Student> getAllStudents();
}
