package com.shashwat.osgi.helloservice.service.impl;

import com.shashwat.osgi.helloservice.service.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String greetHello() {
		System.out.println("HelloServiceImpl.greetHello()");
		return "Hello";
	}
}
