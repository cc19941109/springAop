package com.chen.aopJDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public  class jdkDynamicProxy implements InvocationHandler {

	public Object target;
	
	public jdkDynamicProxy(){
		super();
	}
	
	public  jdkDynamicProxy(Object target) {
		super();
		this.target   = target;
		}
	
	@SuppressWarnings("unchecked")
	public <T> T getProxy(){
		return (T) Proxy.newProxyInstance(
				target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), 
				this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		Object result = method.invoke(target, args);
		after();
		return result;
	}
		
	private void before(){
		System.out.println(getClass().getName()+":before");
	}
	
	private void after() {
		System.out.println(getClass().getName()+":after");
	}
	
}
