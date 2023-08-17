package com.jsp.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
