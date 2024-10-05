package com.jsp.constru.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Solution {

	public static void main(String[] args)
	{
		ApplicationContext con = new ClassPathXmlApplicationContext("spring5.xml");
		
		Student s =con.getBean("student",Student.class);
		System.out.println(s);
		Department d = con.getBean("depart",Department.class);
		System.out.println(d);
		
	}

}
