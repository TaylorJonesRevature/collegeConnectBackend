package com.college.dao;

import com.college.models.Student;
import com.college.models.User;
import com.college.utils.ConnectingUtil;

import java.sql.*;

public class UserDaoDB implements UserDao{

    ConnectingUtil conUtil = ConnectingUtil.getConnectingUtil();

    public User getUserByUsername(String username) {
        User u = new User();

        try {
            Connection con = conUtil.getConnectingUtil().getConnection();
            String sql = "SELECT * FROM USERS WHERE users.username = '" + username + "'";

            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while(rs.next()) {
                u.setId(rs.getInt(1));
                u.setFirstName(rs.getString(2));
                u.setLastName(rs.getString(3));
                u.setEmail(rs.getString(5));
                u.setUsername(rs.getString(6));
                u.setPassword(rs.getString(7));
                u.setValidated(rs.getBoolean(8));
                u.setSecurityCode(rs.getString(9));
            };
            return u;

        } catch(SQLException e) {
            e.printStackTrace();
        };
        return null;
    };

    public void createNewStudent(Student s) throws SQLException{
        Connection con = conUtil.getConnection();

        String sql = "INSERT INTO USERS(first_name, last_name, college_id, email, username, password, user_type) values" + "(?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, s.getFirstName());
        ps.setString(2, s.getLastName());
        ps.setInt(3, s.getCollegeId());
        ps.setString(4, s.getEmail());
        ps.setString(5, s.getUsername());
        ps.setString(6, s.getPassword());
        ps.setString(7, "Student");

        ps.execute();
    }
}
