package com.chen.aopJDK;

public class GreetingImpl implements Greeting {

	public void sayHello(String name) {
		before();
		System.out.println(getClass().getName()+": Hello! " + name);
		after();
	}

	private void after() {
		System.out.println(getClass().getName()+":------after-------");
	}

	private void before() {
		System.out.println(getClass().getName()+":------before-------");
	}

}