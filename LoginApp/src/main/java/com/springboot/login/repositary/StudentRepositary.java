package com.springboot.login.repositary;

import java.util.List;

import com.springboot.login.model.Student;

public interface StudentRepositary {

	public void saveStudent(Student s);
	public List<Student> getAllStudent();
	public List<Student> findbyUP(String username, String password);
	public List<Student> deleteStudent(int rollno);
	public Student editStudent(int rollno);
	public List<Student> updateStudent(Student student);
}
