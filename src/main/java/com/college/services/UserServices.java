package com.college.services;

import com.college.dao.UserDao;
import com.college.models.Student;
import com.college.models.User;

import java.sql.SQLException;

public class UserServices {
    private UserDao uDao;

    public UserServices(UserDao uDao) {
        this.uDao = uDao;
    };

    public User getUserByUsername(String username) throws SQLException {
        User newUser = new User();
        newUser = uDao.getUserByUsername(username);
        return newUser;
    };

    public Student createNewStudent(String firstName, String lastName, int collegeId, String email, String username, String password) {

        Student s = new Student(firstName, lastName, email, username, password, collegeId);

        try {
            uDao.createNewStudent(s);
        } catch(SQLException e) {
            e.printStackTrace();
        };
        return s;
    }
}
