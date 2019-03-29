package org.shw.jdbc.spring.chap2;

public class Greeter {
	public Greeter() {
		System.out.println("Greeter instance created.");
	}
	
	public String greet() {
		return "Hello, World!";
	}
}