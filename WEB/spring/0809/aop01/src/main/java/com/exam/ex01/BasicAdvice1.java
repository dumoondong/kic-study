package com.exam.ex01;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class BasicAdvice1 implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("전처리 구간 1");
		Object rtnObj = invocation.proceed();
		System.out.println("후처리 구간 1");
		
		return null;
	}

}
