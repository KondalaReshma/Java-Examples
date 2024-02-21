package com.spring.orm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.orm.entities.*;
import com.spring.orm.dao.StudentDao;



public class App 
{
    public static void main( String[] args )
    
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    // AnnotationConfigApplicationContext context=  new AnnotationConfigApplicationContext(Configuration);

     
       StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
       
       Student student = new Student(11,"sam","vizag");
       
       studentDao.save(student);
       
       System.out.println("done");

       
       
       
       
       
      
       
         
    }
}
