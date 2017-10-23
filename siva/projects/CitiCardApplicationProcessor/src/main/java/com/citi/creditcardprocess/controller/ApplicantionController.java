package com.citi.creditcardprocess.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.citi.creditcardprocess.service.ApplicationProcessor;





public class ApplicantionController {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		ApplicationProcessor processor = (ApplicationProcessor) context.getBean("processor");
	
			processor.processApplication();
		
	}

}


