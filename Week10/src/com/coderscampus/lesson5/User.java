package com.coderscampus.lesson5;

public class User {
    private String username;
    private String password;
    private Status status;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        status = Status.ACTIVE;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", status=" + status +
                '}';
    }
}