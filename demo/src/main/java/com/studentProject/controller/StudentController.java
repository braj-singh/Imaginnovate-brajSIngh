package com.studentProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.studentProject.entity.Student;
import com.studentProject.service.StudentServiceImpl;



@RestController
@Validated
public class StudentController {

	@Autowired
	private StudentServiceImpl serviceimpl;

	@GetMapping("/StudentMarksheets")
	public List<Student> getStudentMarksheet()
    {
		return this.serviceimpl.getStudentMarksheet() ;
		
   	}
	
	@PostMapping("/StudentMarksheets")
	public Student addStudentDetails(@RequestBody Student student) {
	   	 return this.serviceimpl.addStudentDetails(student);
	    }
	@GetMapping("/StudentMarksheet/{studentId}")
	public Student getStudentMarksheetById(@PathVariable int studenteId) {
	   	 return this.serviceimpl.getStudentMarksheetById(studenteId);
	   	 
	    }
	@PutMapping("/StudentMarksheets")
	public Student updteStudentMarksheet(@RequestBody Student student) {
	   	 return this.serviceimpl.updteStudentMarksheet(student);
	    }
	@DeleteMapping("/studentMarksheets/{studentId}")
	public void deleteStudentMarksheetById(@PathVariable int studentId) {
	   	  this.serviceimpl.deleteStudentMarksheetById(studentId);
	   	 
	    }

}
