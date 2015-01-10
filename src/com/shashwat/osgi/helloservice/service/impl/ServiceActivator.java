package com.shashwat.osgi.helloservice.service.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.shashwat.osgi.helloservice.service.HelloService;

public class ServiceActivator implements BundleActivator {
	ServiceRegistration<?> seriveRegistration;

	@Override
	public void start(BundleContext context) throws Exception {
		HelloService helloService = new HelloServiceImpl();
		seriveRegistration = context.registerService(HelloService.class.getName(), helloService, null);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		seriveRegistration.unregister();
	}

}
