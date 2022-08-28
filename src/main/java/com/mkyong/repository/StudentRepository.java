package com.mkyong.repository;

import com.mkyong.Student;

public interface StudentRepository {
	
	int save(Student student);
	
	int count();
	
}
