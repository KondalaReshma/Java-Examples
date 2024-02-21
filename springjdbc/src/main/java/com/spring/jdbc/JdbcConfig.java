package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoimpl;
import com.spring.jdbc.entites.Student;

@Configuration

public class JdbcConfig {
	@Bean("ds")
	public DataSource getDataSource()
	{
		
		DriverManagerDataSource ds  = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Welcome2evoke@1234");
		return ds;

}
	@Bean("jdbcTemplate")
	public  JdbcTemplate getTemplate()
	
	{
	   JdbcTemplate jdbcTemplate = new JdbcTemplate();
	   jdbcTemplate.setDataSource(getDataSource());
	   return jdbcTemplate ;
	}
	
	@Bean(name={"studentDao"})
	public  StudentDao getStudentDao() {
		
		StudentDaoimpl  studentDao =  new StudentDaoimpl();
		studentDao.setJdbcTemplate(getTemplate());
		return studentDao;
		
	}
}
