package com.exam.ex04;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class WriteAction implements BoardAction,
	BeanNameAware, BeanClassLoaderAware,BeanFactoryAware,
	ApplicationContextAware,DisposableBean,InitializingBean {
	private String Writer;
	
	private String beanName;
	private BeanFactory beanFactory;
	
	public WriteAction() {
		// TODO Auto-generated constructor stub
		System.out.println("1. 빈의 생성자 실행");
	}
	
	public void setWriter(String writer) {
		Writer = writer;
		System.out.println("2. 빈의 생성자 실행");
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("execute() 실행 ");
		System.out.println(beanName);
		System.out.println(beanFactory);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("8.afterPropertiesSet() 실행");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("11.destroy() 실행");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("6.setApplicationContext(ApplicationContext applicationContext) 실행");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("5.setBeanFactory(BeanFactory beanFactory) 실행");
		this.beanFactory = beanFactory;
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		// TODO Auto-generated method stub
		System.out.println("4.setBeanClassLoader(ClassLoader classLoader) 실행");
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("3.setBeanName(String name) 실행");
		this.beanName = name;
	}
	
	//전처리
	public void init_method() {
		System.out.println("9.빈의 사용자 전처리 메서드 실행");
	}
	//후처리
	public void destroy_method() {
		System.out.println("12.빈의 사용자 후처리 메서드 실행");
	}
}
