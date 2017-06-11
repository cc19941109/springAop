package com.chen.aopCGLib;


/**
 *  have problems 
 *  only before---- 
 *  no after 
 *  Exception in thread "main" java.lang.StackOverflowError
 * @author chencheng
 *
 */
public class TestCgLib {
	public static void main(String[] args) {
		CGLibProxy cgLibProxy = new CGLibProxy();
		Base base = Factory.getInstance(cgLibProxy);
		base.add();
	}
}
