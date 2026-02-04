package com.springboot.login.repositary;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.login.model.Student;

@Repository
public class StudentRepositaryImpl implements StudentRepositary{

	 List<Student> list= new ArrayList<>();
	@Override
	public void saveStudent(Student s) 
	{
      list.add(s);
      System.out.println(list);
	}
	@Override
	public List<Student> getAllStudent()
	{
	  return list;
	}
	@Override
	public List<Student> findbyUP(String username, String password) 
	{
		List<Student> l=new ArrayList<Student>();
		for(Student stu:list)
		{
		  if(username.equals(stu.getUsername())&&password.equals(stu.getPassword()))
		  {
			  int index=list.indexOf(stu);
			  Student s=list.get(index);
			  l.add(s);
		   break;	
		  }
		}
		return l;
	}
	@Override
	public List<Student> deleteStudent(int rollno) 
	{
		for(Student s:list)
		{
			if(rollno==s.getRollno())
			{
				  int index =list.indexOf(s);
				  list.remove(index);
				  break;
			}
		}
		return list;
	}
	@Override
	public Student editStudent(int rollno)
	{
		Student st=null;
		for(Student s:list)
		{
			if(rollno==s.getRollno())
			{
				 int index= list.indexOf(s);
				 st=list.get(index);
				break;
			}
		}
		return st;
	}
	@Override
	public List<Student> updateStudent(Student student) 
	{
		for(Student s:list)
		{
			if(s.getRollno()==student.getRollno())
			{ 
			int index=list.indexOf(s);
				list.set(index, student);
				break;
			}
		}
		return getAllStudent();
	}

}
