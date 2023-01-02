package com.college.driver;

import com.college.dao.UserDao;
import com.college.dao.UserDaoDB;
import com.college.models.Student;
import com.college.models.Textbook;
import com.college.models.User;
import com.college.services.UserServices;

import java.sql.SQLException;
import java.util.ArrayList;

public class CollegeConnectDriver {
    private static UserDao uDao = new UserDaoDB();
    private static UserServices uServ = new UserServices(uDao);

    public static void main(String[] args) throws SQLException {
        uServ.createNewStudent("Natawnee", "Jones-Kell", 2, "natawneetjk@gmail.com", "tiger", "stripes");
    }
}
