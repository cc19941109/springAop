package com.chen.springAop;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class ThrowableAdvice implements ThrowsAdvice{
	public void afterThrowing(Method method, Object[] args, Object target, Exception e) {
        System.err.println("---------- Throw Exception ----------");
        System.err.println("Target Class: " + target.getClass().getName());
        System.err.println("Method Name: " + method.getName());
        System.err.println("Exception Message: " + e.getMessage());
        System.err.println("-------------------------------------");
    }
	
}
