package com.niit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Publisher msg = context.getBean("publisher",Publisher.class);
        System.out.println(msg);
        System.out.println( "Hello World!!!" );
    }
}
