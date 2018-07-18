package com.revature.sports;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DefenseAspect {
	
	@Before("execution(void com.revature.sports.Football.toss (double, double))")
	public void sack(){
		
		System.out.println("Just sacked the QB");
		
	}
	
	@Pointcut("execution( * com.revature.sports.Football.grab (..))")
	public void pointCutForGrab(){}
	
	@AfterReturning(value="pointCutForGrab()", returning="returnObject")
	public void interception(JoinPoint jp, Object returnObject){
		
		System.out.println(jp.getSignature().getName());
		if(returnObject instanceof Boolean && (Boolean) returnObject){
			System.out.println("Intercepted the Football");
		}
		else{
			
			System.out.println("could not intercept");
			
		}
		
	}

}
