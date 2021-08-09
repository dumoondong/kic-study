package com.exam.ex02;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class BasicAdvice1 {
	
	public Object logAround(ProceedingJoinPoint joinpoint) throws Throwable {
		
		System.out.println("전처리 1");
		Object rtnObj = joinpoint.proceed();
		System.out.println("후처리 1");
		return rtnObj;
	}
	
	public void before() throws Throwable {
		System.out.println("전처리 1");
	}
	
	public void after() throws Throwable {
		System.out.println("후처리 1");
	}
}
