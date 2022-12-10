package com.annotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.annotations.Student;

@RestController
public class MyController 
{
	
	
	
	
	@Autowired
	@Qualifier("Student1")
	private Student student;
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	
 
		
	@ResponseBody
		public Student home(@RequestBody Student st)
	//public Student home()
		{
		st.studying();
	 System.out.println("this is homes method");
	this.student.setName("Bansi Patel");
	 return this.student;
 }
	
	@RequestMapping(value = "/user/{userId}" , method = RequestMethod.GET)
	public String user(@PathVariable("userId") Integer userId)
	{
		return String.valueOf(userId);
		
	}
}
