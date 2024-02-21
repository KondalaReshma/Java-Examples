package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.incrementer.SybaseAnywhereMaxValueIncrementer;

import com.spring.jdbc.entites.Student;

public class StudentDaoimpl implements StudentDao {
	
	private JdbcTemplate jdbcTemplate ;

	public int insert(Student student) {
		
		String query = "insert into student(id,name,city)values(?,?,?)";
		
		int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		
		return r;
	}
	
	
	
	public int change(Student student) {
		//updating data
		
		String query = "update student set name=?, city=? where id =?";
		int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	
	
	public int delete(int studentId) {
		// delete operation 
		
		String query = "delete from student where id=?";
		int result  = this.jdbcTemplate.update(query,studentId);
		return result;
	}
	
	

	public Student getStudent(int studentId) {
		//select single student data
		String query ="select * from student where id =?";
		RowMapper<Student>rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, new RowMapper() {

			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Student  student = new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setCity(rs.getString(3));
				
				// TODO Auto-generated method stub
				return student;
			}
			
		},studentId);
		return student ;
	}

   //  selecting multiple objects 
	
	
	public List<Student> getAllStudents() {
		
		
		String query = "select * from   student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		
		return students;
	}


	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	public void setSessionFactory(SessionFactory object) {
		// TODO Auto-generated method stub
		
	}



	



	
	
	
}

