package com.annotations;



import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = {"mypackage"})
public class MyConfig
{
	
	
	
	
	
	
	

	@Bean("Student1")
	@Lazy
public Student getStudent()
{
		System.out.println("creating student object");

return new Student( "Student1");

}
	@Bean("Student2")
	@Lazy
	public Student createStudent()
	{
		System.out.println("creating the second student object.");
		return new Student("Student2");
	}
	
	@Bean
	public Date getDate()
	{
		System.out.println("creating new Date.");
		return new Date();
	}
	
	
}
