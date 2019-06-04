package com.example.demo.MyBatisDemo;

import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    public void insertUser(User user);
    public void getUser(Integer id);
}
