package com.jsp2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) 
	{
		System.out.println("program execution started "   );
		ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
		Employee e=context.getBean("emp1",Employee.class );
		System.out.println(e);
		System.out.println("program execution completed " );
	}

}
