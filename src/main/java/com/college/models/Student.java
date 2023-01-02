package com.college.models;

import java.util.ArrayList;

public class Student extends User {
    private String user_type;
    private int collegeId;
    private ArrayList<Textbook> textbooks;

    public Student (String firstName, String lastName, String email, String username, String password, int collegeId) {
        super(firstName, lastName, email, username, password);
        this.collegeId = collegeId;
        this.user_type = "Student";
    };

    public String getUserType() {
        return user_type;
    };

    public void setUserType(String user_type) {
        this.user_type = user_type;
    };

    public int getCollegeId() {
        return collegeId;
    };

    public void setCollegeId(int collegeId){
        this.collegeId = collegeId;
    };

    public ArrayList<Textbook> getTextbooks() {
        return textbooks;
    };

    public void setTextbooks(ArrayList<Textbook> textbooks) {
        this.textbooks = textbooks;
    }

    @Override
    public String toString() {
        return super.toString() + ", userType=" + user_type + ", collegeId=" + collegeId + ", textbooks" + textbooks + "]";
    };
}
