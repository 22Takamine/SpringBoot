package com.example.entity;

public class User {
    private Integer id;
    private String name;
    private String mail;

    public User() {

    }

    public User(Integer id, String name, String mail) {
        this.id = id;
        this.name = name;
        this.mail = mail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}

