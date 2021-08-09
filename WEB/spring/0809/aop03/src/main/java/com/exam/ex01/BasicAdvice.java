package com.exam.ex01;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BasicAdvice {
	
	@Around("execution(* execute())")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("전처리1");
		
		Object rtnObj = joinPoint.proceed();
		
		System.out.println("후처리1");
		 
		return rtnObj;
	}
	
	@Before("execution(* excute())")
	public void before() {
		System.out.println("전처리");
	}
	
	@After("execution(* excute())")
	public void after() {
		System.out.println("후처리");
	}
}
