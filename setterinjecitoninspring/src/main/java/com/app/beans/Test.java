package com.app.beans;


	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	import com.app.beans.Person;

	public class Test {

	        public static void main(String[] args) {
	                // TODO Auto-generated method stub
	                ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	        Person p=(Person)context.getBean("person");
	        System.out.println("Name :"+p.getName());
	        System.out.println("Gender :"+p.getGender());
	        System.out.println("Address :"+p.getAddress());
	        System.out.println("Age :"+p.getAge());
	        }
	}


