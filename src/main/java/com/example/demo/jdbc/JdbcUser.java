package com.example.demo.jdbc;

public class JdbcUser {
    private int id;
    private String name;
    private int age;
    private String sex;

    public JdbcUser(int id, String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public JdbcUser setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public JdbcUser setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public JdbcUser setAge(int age) {
        this.age = age;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public JdbcUser setSex(String sex) {
        this.sex = sex;
        return this;
    }
}
