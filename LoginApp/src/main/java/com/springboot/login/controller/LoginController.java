package com.springboot.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.login.model.Student;
import com.springboot.login.servicei.StudentServiceI;

@Controller
public class LoginController {
	
	@Autowired
	StudentServiceI stuservice;
	
	@RequestMapping("/")
	public String prelogin()
	{
		System.out.println("LoginContoller.prelogin()");
		return "login";
	}
	
	@RequestMapping("/register")
	public String prergister()
	{
		return "register";
	}
	@RequestMapping("/success")
	public String savesuccess()
	{
		return "success";
	}
	@RequestMapping("/save")
	public String saveStudent(@ModelAttribute Student s)
	{
		stuservice.saveStudent(s);
		return "login";
	}
	
	@RequestMapping("/login")
	public String loginStudent(@RequestParam("username")String username,
			                   @RequestParam("password")String password, Model m)
	{
		
		if(username.equals("Admin")&& password.equals("admin"))
		{
			List<Student>list=stuservice.getAllStudent();
			   if(!list.isEmpty())
			   {	   
		       m.addAttribute("stulist", list);
		       return "success";
		       }else
		       {
			    return "login";
		       }
	    }else
	    {
	    	List<Student>slist=stuservice.findbyUP(username, password);
			   if(!slist.isEmpty())
			   {	   
		       m.addAttribute("stulist", slist);
		       return "success";
		       }else
		       {
			    return "login";
		       }
	    }
	}
	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam("rno")int rollno, Model m)
	{
		List<Student> list=stuservice.deleteStudent(rollno);
		m.addAttribute("stulist", list);
		return "success";
	}
	@RequestMapping("/edit")
	public String editStudent(@RequestParam("rno")int rollno, Model m)
	{  
		      Student st =stuservice.editStudent(rollno);
		      m.addAttribute("stu", st);
		return "edit";
	}
	@RequestMapping("/update")
	public String updateStudent(@ModelAttribute Student student,Model m)
	{
		List<Student> slist=stuservice.updateStudent(student);
		System.out.println("\nupdated Student:"+slist);
		m.addAttribute("stulist", slist);
		return "success";
	}
}
