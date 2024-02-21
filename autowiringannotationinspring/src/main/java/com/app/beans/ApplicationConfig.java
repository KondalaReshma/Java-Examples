package com.app.beans;


import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ApplicationConfig {
	@Bean
    public Employee employee() {
            // Creating an 'Employee' bean
            Employee employee = new Employee();

            Scanner sc=new Scanner(System.in);
    System.out.println("Enter Employee ID :");
    int empId=sc.nextInt();
    System.out.println("Enter Name :");
    String name=sc.next();
            // Setter-based injection:-
    
    
            // Similar to <property name="empId" value="1234" />
            employee.setEmpId(empId);

            // Similar to <property name="empName" value="Abhishek" />
            employee.setEmpName(name);

            // The below statement isn't required due to 'autowiring'
            // employee.setPassObj(passObj());

            return employee;
    }

    @Bean
    public Passport passObj() {

            // Creating a 'Passport' bean
            Passport passport = new Passport();

            Date todayDate = new Date();

            // Using 'Calendar' class to add 84 days to todayDate (expiryDate)
            Calendar cal = Calendar.getInstance();
            cal.setTime(todayDate);
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Passport Number :");
            int passNo=sc.nextInt();
            cal.add(Calendar.DATE, 84);

            Date expiryDate = cal.getTime();
            
            

            // Similar to <property name="passNum" value="9876" />
            
            passport.setPassNum(passNo);

            // The below 2 setters cannot be used in an xml config file
            // as they are dynamic values
            passport.setDateOfIssue(todayDate);
            passport.setDateOfExpiry(expiryDate);

            return passport;
    }


}
