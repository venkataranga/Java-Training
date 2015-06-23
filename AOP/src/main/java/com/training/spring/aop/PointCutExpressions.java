package com.training.spring.aop;

import org.aspectj.lang.annotation.Pointcut;

public class PointCutExpressions {

	//@Deprecated
	@Pointcut("execution(public * Cal.divide(..))")
	public void divideMethodPointCut() {
		
	}
	
}
