package com.college.dao;

import com.college.models.Student;
import com.college.models.User;

import java.sql.SQLException;

public interface UserDao {

    User getUserByUsername(String username);
    void createNewStudent(Student newStudent) throws SQLException;
}
