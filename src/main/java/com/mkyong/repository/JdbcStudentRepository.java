package com.mkyong.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mkyong.Student;
@Repository
public class JdbcStudentRepository implements StudentRepository {

	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	@Override
	public int save(Student student) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(
                "insert into Student (id, name, collagename) values(?,?,?)",
               student.getId(), student.getName(), student.getCollagename());
		
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("select count(*) from student", Integer.class);
	}

}
