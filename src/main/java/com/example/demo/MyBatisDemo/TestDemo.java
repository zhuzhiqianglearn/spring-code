package com.example.demo.MyBatisDemo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class TestDemo {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        String resource="main/resources/beanMybatis.xml";
        InputStream configFile = null;
        Reader reader=null;
        try {
            configFile=new FileInputStream(
                    "C:\\ideasvn\\springcloud学习\\github-3530428398\\spring-code\\src\\main\\java\\com\\example\\demo\\MyBatisDemo\\beanMybatis.xml");
//            reader= Resources.getResourceAsReader(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
         sqlSessionFactory=new SqlSessionFactoryBuilder().build(configFile);
    }
    public static void main(String[] args) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            mapper.insertUser(new User(0,"zzqmybatis",100008,"nan"));
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
