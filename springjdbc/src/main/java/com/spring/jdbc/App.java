package com.spring.jdbc;

import java.io.ObjectInputFilter.Config;
import java.util.List;

import javax.swing.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.xml.Jdbc4SqlXmlHandler;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("My program started..........");

		// spring jdbc =>jdbc Template

		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);

		// JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);

		// insert query

		// String query = "insert into student(id,name,city)values(?,?,?)";

		// fire query

		// int result = template.update(query,103,"praneetha","Vizag");

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		// INSERT

		// Student student = new Student();
		// student.setId(11);
		// student.setName("hema");
		// student.setCity("france");
		// int result = studentDao.insert(student);

		// UPDATE

		// Student student = new Student();
		// student.setId(111);
		// student.setName("sunny");
		// student.setCity("jammu");
		// int r = studentDao.change(student);
		// System.out.println("datachanged" + r);

		// System.out.println("student added" + result);

		// DELETE

		//int result = studentDao.delete(111);
		//System.out.println("deleted" + result);
		
		
		
		
		//Student student =studentDao.getStudent(101);
		
		//System.out.println(student);
		
		List<Student> students = studentDao.getAllStudents();
		
		
		for (Student s:students)
		{
		   
			System.out.println(s);
			
		}
	}

}