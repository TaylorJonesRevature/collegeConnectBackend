package com.college.models;

public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private boolean validated;
    private String securityCode;

    public User() {

    }

    public User(String firstName, String lastName, String email, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.validated = false;
        this.securityCode = null;
    };

    public int getId() {
        return id;
    };

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    };

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    };

    public String getLastName() {
        return lastName;
    };

    public void setLastName(String lastName) {
        this.lastName = lastName;
    };

    public String getEmail(){
        return email;
    };

    public void setEmail(String email) {
        this.email = email;
    };

    public String getUsername() {
        return username;
    };

    public void setUsername(String username) {
        this.username = username;
    };

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    };

    public boolean getValidated() {
        return validated;
    };

    public void setValidated(boolean validated) {
        this.validated = validated;
    };

    public String getSecurityCode() {
        return securityCode;
    };

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public String toString() {
        return "[firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", username=" + username + ", password=" + password + "]";
    }



}
