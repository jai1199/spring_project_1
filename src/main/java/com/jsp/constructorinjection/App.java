package com.jsp.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) 
	{
	  ApplicationContext con = new ClassPathXmlApplicationContext("spring4.xml");
	  Emp e =(Emp) con.getBean("emp1");
	  System.out.println(e);
	} 

}
