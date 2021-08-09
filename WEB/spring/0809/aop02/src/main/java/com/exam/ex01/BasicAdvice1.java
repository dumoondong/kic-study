package com.exam.ex01;

import org.aspectj.lang.ProceedingJoinPoint;

public class BasicAdvice1 {
	
	public Object logAround(ProceedingJoinPoint joinpoint) throws Throwable {
		
		System.out.println("전처리 1");
		Object rtnObj = joinpoint.proceed();
		System.out.println("후처리 1");
		return rtnObj;
	}
}
