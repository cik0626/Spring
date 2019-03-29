package org.shw.jdbc.spring.chap2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringjdbcMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("chap02.xml");
		Greeter g1 = ctx.getBean("greeter", Greeter.class);
		System.out.println(g1.greet());
		
		Greeter g2 = ctx.getBean("greeter", Greeter.class);
		System.out.println(g2.greet());
		
	}

}