package com.example.demo.jdbc;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserServer {
    public void save(JdbcUser user) throws Exception;
    public List<JdbcUser> getUser();
}
