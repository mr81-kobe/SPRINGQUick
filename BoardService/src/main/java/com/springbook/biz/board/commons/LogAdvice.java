package com.springbook.biz.board.commons;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
@Service
@Aspect
public class LogAdvice {

	public LogAdvice() {
		// TODO Auto-generated constructor stub
	} 
	

	
	
	@Before("PointcutCommon.allPointcut()") 
	public void printLog(){
		System.out.println("���� �α� �����Ͻ� ���� ���� �� ����");
	} 
}

