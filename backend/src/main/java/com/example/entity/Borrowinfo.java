package com.example.entity;


import lombok.Data;

@Data
public class Borrowinfo {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
