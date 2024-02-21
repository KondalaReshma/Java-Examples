package com.springorm;
import com.springorm.service.*;
import com.springorm.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	UserService userService = context.getBean("userServiceImpl",UserServiceImpl.class);
	userService.save();
}
}
