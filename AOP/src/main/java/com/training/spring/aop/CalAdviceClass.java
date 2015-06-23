package com.training.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class CalAdviceClass {

	
	
	//@Before("execution(public * Cal.add(..))")
	//@Before("@annotation(AOP)")
	@Before("within(Cal) && (!execution(* *.add(..)))")
	
	public void log(JoinPoint joinPoint){
		System.out.println("from adivce method, executing before: "+joinPoint.getSignature().getName());
		Object o = joinPoint.getTarget();
		System.out.println(o);
		
	}
	
	@AfterThrowing(pointcut="PointCutExpressions.divideMethodPointCut()",
					throwing="e")
			
	public void error(Throwable e){
		System.out.println("exception occoured");
		System.out.println(e.getMessage());
	}
	
//	@AfterReturning(pointcut="execution(public * Cal.divide(..))"/*, returning="returnValue"*/)
//	public void afterReturningAdvice(Object returnValue){
//		System.out.println("CalAdviceClass.printReturnValue()");
//		//System.out.println(returnValue);
//	}
	
	@Around("PointCutExpressions.divideMethodPointCut()")
	public Object aroundAdvice(ProceedingJoinPoint jp) throws Throwable{
		System.out.println("from around advice");
		System.out.println("Starting actual method execution...");
		Object result = jp.proceed();
		System.out.println("Join Point return value is: "+result);
		System.out.println("returned actual method execution...");
		return result;
	}
}
