package com.chen.springAop;

import org.springframework.aop.framework.ProxyFactory;

public class TestSpringAop {
	
	/**
	 *     public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();     // 创建代理工厂
        proxyFactory.setTarget(new GreetingImpl());         // 射入目标类对象
        proxyFactory.addAdvice(new GreetingBeforeAdvice()); // 添加前置增强
        proxyFactory.addAdvice(new GreetingAfterAdvice());  // 添加后置增强 
 
        Greeting greeting = (Greeting) proxyFactory.getProxy(); // 从代理工厂中获取代理
        greeting.sayHello("Jack");                              // 调用代理的方法
    }
	 */
	/**
	 * ApplicationContext context = new ClassPathXmlApplicationContext("aop/demo/spring.xml"); // 获取 Spring Context
        Greeting greeting = (Greeting) context.getBean("greetingProxy");                        // 从 Context 中根据 id 获取 Bean 对象（其实就是一个代理）
        greeting.sayHello("Jack");   
	 * @param args
	 */
	
	public static void main(String[] args) {
		ProxyFactory proxyFactory =new ProxyFactory();
		proxyFactory.setTarget(new AOPImpl());
		proxyFactory.addAdvice(new BeforeAdvice());
		proxyFactory.addAdvice(new AfterAdvice());
		proxyFactory.addAdvice(new ThrowableAdvice());
		
		IAOP iaop =(IAOP) proxyFactory.getProxy();
		iaop.test();
		
	}
}
