package com.example.demo;

import com.example.demo.MyBatisDemo.User;
import com.example.demo.MyBatisDemo.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class TestDemo {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        String resource="classpath:beanMybatis.xml";
        Reader reader=null;
        try {
            reader= Resources.getResourceAsReader(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
    }
    public static void main(String[] args) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            mapper.insertUser(new User(0,"zzqmybatis",18,"nan"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
