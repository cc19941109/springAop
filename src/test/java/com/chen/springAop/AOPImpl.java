package com.chen.springAop;

public class AOPImpl implements IAOP{

	@Override
	public void test() {
		System.out.println(getClass().getName()+"--------aop test success!");
		throw new RuntimeException(getClass().getName()+"----- i catch an error !!!!");

	}
}
