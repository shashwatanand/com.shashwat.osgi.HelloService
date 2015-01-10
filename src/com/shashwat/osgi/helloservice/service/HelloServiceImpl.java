package com.shashwat.osgi.helloservice.service;

public class HelloServiceImpl implements HelloService {

	@Override
	public String greetHello() {
		System.out.println("HelloServiceImpl.greetHello()");
		return "Hello";
	}
}
