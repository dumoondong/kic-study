package com.exam.ex02;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

public class BasicAdvice1 implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("전처리 구간 1");
		
		String methodName = invocation.getMethod().getName();
		StopWatch stopWatch = new StopWatch();
		stopWatch.start(methodName);
		
		Object rtnObj = invocation.proceed();
		System.out.println("후처리 구간 1");
		
		stopWatch.stop();
		System.out.println("메서드명 : " + methodName);
		System.out.println("실행시간 : " + stopWatch.getTotalTimeSeconds()+"초");
		
		return rtnObj;
	}

}
