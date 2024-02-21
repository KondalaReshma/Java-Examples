package com.springcore.constructorinjection;

import java.awt.image.AreaAveragingScaleFilter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	ApplicationContext context 	 = new ClassPathXmlApplicationContext("com/springcore/constructorinjection/ciconfig.xml");
	
	  Person p = (Person) context.getBean("person");
	  
	  
	     Addition add = (Addition) context.getBean("add");
	  
	  System.out.println(p);
	  add.dosum();

	}

}
