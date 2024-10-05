package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "program execution started" );
        ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
		/*
		 * Student stu = (Student) con.getBean("student1"); System.out.println(stu);
		 * Student s = (Student) con.getBean("student2"); System.out.println(s);
		 */
        Student student = (Student) con.getBean("stu12");
        System.out.println(student);
        System.out.println( "program execution completed ");
    }
}
