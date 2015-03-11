package com.levelup.spring.dao.mapper;

import com.levelup.spring.model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by GEO on 10.03.15.
 */
public class StudentRowMapper implements RowMapper<Student> {

        @Override
        public Student mapRow(ResultSet resultSet, int i) throws SQLException {
            Student student = new Student();
            student.setId(resultSet.getLong("ID"));
            student.setFirstName(resultSet.getString("firstnam"));
            student.setLastName(resultSet.getString("lastname"));
            return student;
        }

}
