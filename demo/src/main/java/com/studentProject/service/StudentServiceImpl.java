package com.studentProject.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.studentProject.entity.Student;
@Service
public interface StudentServiceImpl {

	List<Student> getStudentMarksheet();

	Student addStudentDetails(Student student);


	Student getStudentMarksheetById(int studenteId);

	Student updteStudentMarksheet(Student student);


	void deleteStudentMarksheetById(int studenteId);

	

}
