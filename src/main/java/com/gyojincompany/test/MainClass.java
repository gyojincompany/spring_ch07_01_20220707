package com.gyojincompany.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AbstractApplicationContext ctx = new GenericXmlApplicationContext();
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		ctx.load("classpath:applicationCTX.xml");
		
		ctx.refresh();
		
		Student student = ctx.getBean("student",Student.class);
		System.out.println(student.getName());//홍길동 출력
		
		ctx.close();
		
	}

}
