package com.jsp.refrencetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
  public static void main(String[] args) 
  {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");
	Tom tom=context.getBean("tamtam",Tom.class);
	System.out.println(tom);
	Bom b = context.getBean("bambam",Bom.class);
	System.out.println(b);
	
  }
}
