package com.chen.aopCGLib;

import java.lang.reflect.Method;

import org.mockito.cglib.proxy.MethodInterceptor;
import org.mockito.cglib.proxy.MethodProxy;

public class CGLibProxy implements MethodInterceptor{

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println(getClass().getName()+"before----");
		proxy.invoke(obj, args);
		System.out.println(getClass().getName()+"after-----");
		
		
		return null;
	}



}
