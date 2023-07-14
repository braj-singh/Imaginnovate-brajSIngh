package com.studentProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.studentProject.dao.StudentDao;
import com.studentProject.entity.Student;
@Service
public class StudentService implements StudentServiceImpl {

	@Autowired
	private StudentDao studentdao;
	
	public StudentService() {
		
	}
	
	public List<Student> getStudentMarksheet() {
		
		return studentdao.findAll();
	}
     
	
	public Student addStudentDetails(Student student) {
	   	 return this.studentdao.save(student);
	    }

	

	@Override
	public Student getStudentMarksheetById(int studenteId) {
		
		return this.studentdao.getById(studenteId);
	}

	@Override
	public Student updteStudentMarksheet(Student student) {
		
		return this.studentdao.save(student);
	}

	
	  @Override 
	  public void deleteStudentMarksheetById(int studentId) {
		  Student entity=studentdao.getById(studentId);
			studentdao.delete(entity);
		  
	  
	  
	 
	
	
}
}

