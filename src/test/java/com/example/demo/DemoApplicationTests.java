package com.example.demo;

import com.example.demo.lookup.AbstactUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:bean.xml");
		  AbstactUser abstactUser= (AbstactUser) applicationContext.getBean("getuser");
		  abstactUser.so();

	}

}
