package com.springboot.login.servicei;
import com.springboot.login.model.Student;
import com.springboot.login.repositary.StudentRepositary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentServiceI{
    @Autowired
	StudentRepositary sr;
	
    @Override
	public void saveStudent(Student s) 
	{
       sr.saveStudent(s);
	}

	@Override
	public List<Student> getAllStudent() {
		return sr.getAllStudent();
	}

	@Override
	public List<Student> findbyUP(String username, String password)
	{
		return sr.findbyUP(username, password);
	}

	@Override
	public List<Student> deleteStudent(int rollno) {
		
		return sr.deleteStudent(rollno);
	}

	@Override
	public Student editStudent(int rollno) {
		return sr.editStudent(rollno);
	}

	@Override
	public List<Student> updateStudent(Student student) {
		return sr.updateStudent(student);
	}

	
}
