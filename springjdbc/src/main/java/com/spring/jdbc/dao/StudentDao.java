package com.spring.jdbc.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.spring.jdbc.entites.Student;

public interface StudentDao {

	
	public int insert(Student student );
	public int change (Student student);
	public int delete(int studentId);
	public Student getStudent(int studentId);
	public List<Student>  getAllStudents();
	public void setSessionFactory(SessionFactory object);
}

