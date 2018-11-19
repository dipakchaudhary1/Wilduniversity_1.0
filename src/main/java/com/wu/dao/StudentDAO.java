package com.wu.dao;

import java.util.List;

import com.wu.bean.Student;


public interface StudentDAO {
	public void saveOrUpdate(Student student) ;
	
	public void delete(int studentId);
	
	public Student get(int studentId);
	
	public List<Student> list();
}
