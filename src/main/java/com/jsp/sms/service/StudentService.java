package com.jsp.sms.service;

import java.util.List;

import com.jsp.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student savestudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
