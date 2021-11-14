package com.springbook.biz;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

public class UserClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml"); 
		UserService service = (UserService) factory.getBean("userService"); 
		UserVO vo = new UserVO();
		vo.setId("12");
		vo.setPassword("1234");
		service.getUser(vo);
		UserVO user = service.getUser(vo); 
		if(user!=null){
			System.out.println(user.getId()+"�� ȯ���մϴ�.");
		}else{
			System.out.println("�α��� ����");
		}
	
	
	
	BoardVO board = new BoardVO();  
	
	
	
	}

}
