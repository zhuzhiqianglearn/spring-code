package com.example.demo.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.List;

public class UserServerImp implements UserServer{

    private JdbcTemplate jdbcTemplate;

    public UserServerImp(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    @Transactional
    public void save(JdbcUser user) throws Exception {
        jdbcTemplate.update("INSERT INTO USER (name,age,sex) VALUES(?,?,?)",
                new Object[]{user.getName(),user.getAge(),user.getSex()},
                new int[]{Types.VARCHAR,Types.INTEGER,Types.VARCHAR}
                );
        throw new RuntimeException("aa");
//        throw new Exception();
    }

    @Override
    public List<JdbcUser> getUser() {
        return jdbcTemplate.query("select * from user",new JdbcUserRowMapper());
    }
}
