package com.example.demo.jdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUserRowMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        JdbcUser user=new JdbcUser(rs.getInt("id"),rs.getString("name"),rs.getInt("age"),
                                   rs.getString("sex"));
        return user;
    }
}
