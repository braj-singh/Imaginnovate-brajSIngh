package com.studentProject.entity;



import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;




@Entity
public class Student {

	 @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
	
	 @Size(min = 3, message = "Last name must have at least 3 characters")
	 private String FirstName;
	 @Size(min = 3, message = "Last name must have at least 3 characters")
	 private String LastName;
	 @Min(value = 16, message = "Age must be greater than 15")
	 @Max(value = 20, message = "Age must be less than or equal to 20")
	 private String DOB;
	 @Pattern(regexp = "^[A-C]$", message = "Section must be A, B, or C")
	 private String Section;
	 @Pattern(regexp = "^[MF]$", message = "Gender must be M or F")
	 private String Gender;
 
	 private int Marks1;
	 private int Marks2;
	 private int Marks3;
	 private int Total;
	 private int Average;
	 private String Result;
	public Student(int id, String firstName, String lastName, String dOB, String section, String gender, int marks1,
			int marks2, int marks3, int total, int average, String result) {
		super();
		id = id;
		FirstName = firstName;
		LastName = lastName;
		DOB = dOB;
		Section = section;
		Gender = gender;
		Marks1 = marks1;
		Marks2 = marks2;
		Marks3 = marks3;
		Total = total;
		Average = average;
		Result = result;
	}
	@Override
	public String toString() {
		return "Student [Id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", DOB=" + DOB
				+ ", Section=" + Section + ", Gender=" + Gender + ", Marks1=" + Marks1 + ", Marks2=" + Marks2
				+ ", Marks3=" + Marks3 + ", Total=" + Total + ", Average=" + Average + ", Result=" + Result + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getSection() {
		return Section;
	}
	public void setSection(String section) {
		Section = section;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	@Nullable
	public int getMarks1() {
		return Marks1;
	}
	public void setMarks1(int marks1) {
		Marks1 = marks1;
	}
	@Nullable
	public int getMarks2() {
		return Marks2;
	}
	public void setMarks2(int marks2) {
		Marks2 = marks2;
	}
	@Nullable
	public int getMarks3() {
		return Marks3;
	}
	public void setMarks3(int marks3) {
		Marks3 = marks3;
	}
	public int getTotal() {
		return  Marks1 + Marks2 + Marks3;
	}
	public void setTotal(int total) {
		Total = total;
	}
	public int getAverage() {
		return  (int) getTotal() / 3;
	}
	public void setAverage(int average) {
		Average = average;
	}
	public String getResult() {
	 if (getAverage() >= 35) {
            return "Pass";
        } else {
            return "Fail";
        }
	}
	public void setResult(String result) {
		Result = result;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
