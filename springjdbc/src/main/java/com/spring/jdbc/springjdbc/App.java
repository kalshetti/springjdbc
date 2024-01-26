package com.spring.jdbc.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("application started.........");
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/springjdbc/springjdbcconfig.xml");
    	JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
    	
    	String query = "insert into student(id, name, city) values(?, ?, ?)";
    	int result = template.update(query, 121, "sumit", "lucknow");
    	System.out.println("record inserted into database"+result);
    }
}
