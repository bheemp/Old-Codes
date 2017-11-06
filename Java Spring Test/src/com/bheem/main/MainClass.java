package com.bheem.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bheem.service.GreetingMessageService;
public class MainClass {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ct  = new ClassPathXmlApplicationContext("classpath*:beans.xml");
		GreetingMessageService greetingMessageService =  ct.getBean("greetingMessageService",GreetingMessageService.class);
		System.out.println(greetingMessageService.greetUser());

	}

}
