package com.stackroute.spring.ioc.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
//       Instantiating Core Container
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	Hobby hobby1 = context.getBean("hobby1", Hobby.class);
    	System.out.println(hobby1);
    	
    	Hobby hobby1ref = context.getBean("hobby1", Hobby.class);
    	System.out.println(hobby1ref);
    	
    	Hobby hobby2 = context.getBean("hobby2", Hobby.class);
    	System.out.println(hobby2);
    	
    	Student student1 = context.getBean("student1",Student.class);
    	System.out.println(student1);
    	
    	student1.getHobbiesList().forEach(hobby -> System.out.println(hobby.getHobbyName()));
    	
    	((AbstractApplicationContext) context).close();
    }
}
