package com.greatlearning.javafsd.studentmanagement.service;

import java.util.List;

import javax.transaction.Transactional;

import com.greatlearning.javafsd.studentmanagement.entity.Student;

public interface StudentService {

	List<Student> listAll();

	void save(Student thestudent);

	Student findById(int theId);

	void deleteById(int theId);

}
