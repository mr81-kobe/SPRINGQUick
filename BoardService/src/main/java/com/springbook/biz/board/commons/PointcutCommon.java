package com.springbook.biz.board.commons;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class PointcutCommon {

	public PointcutCommon() {
		// TODO Auto-generated constructor stub
	}
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	public void allPointcut(){
		
	} 
	
	@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
	public void getPointcut(){
		
	}
}
