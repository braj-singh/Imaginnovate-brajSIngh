package com.studentProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.studentProject.entity.Student;

public interface StudentDao extends JpaRepository<Student,Integer> {

}
