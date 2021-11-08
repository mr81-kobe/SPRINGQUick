/*package com.springbook.view.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

*//**
 * Servlet implementation class DispatcherServlet
 *//*
@WebServlet(name = "action", urlPatterns = { "*.do" })
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    *//**
     * @see HttpServlet#HttpServlet()
     *//*
    public DispatcherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	*//**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request,response);
	}

	*//**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("EUC-KR"); 
		process(request,response);
		
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		String uri = request.getRequestURI(); 
		String path = uri.substring(uri.lastIndexOf("/")); 
		System.out.println(path); 
		
		
		
		if(path.equals("login.do")){
			System.out.println("�α��� ó��"); 
			
			String id = request.getParameter("id"); 
			String password= request.getParameter("password"); 
			UserDAO userDAO = new UserDAO();
			UserVO vo = new UserVO(); 
			vo.setId(id);
			vo.setPassword(password);
			
			UserVO user = userDAO.getUser(vo); 
			
			
			
			if(user!=null){
				response.sendRedirect("getBoardList.do");
			}else{
				response.sendRedirect("login.jsp");
			}
		}
		else if(path.equals("/logout.do")){
			System.out.println("�α׾ƿ� ó��");
			HttpSession session = request.getSession(); 
			session.invalidate();
			response.sendRedirect("login.jsp");
			
			
			
		}else if(path.equals("/insertBoard.do")){
			System.out.println("�� ��� ó��");
			String title = request.getParameter("title"); 
			String writer = request.getParameter("writer"); 
			String content = request.getParameter("content"); 
			BoardVO vo = new BoardVO(); 
			vo.setTitle(title);
			vo.setContent(content);
			vo.setWriter(writer); 
			
			BoardDAO dao = new BoardDAO(); 
			dao.insertBoard(vo);
			response.sendRedirect("getBoardList.do");
			
			
		}else if(path.equals("/updateBoard.do")){
			System.out.println("�� ���� ó��"); 
			String title = request.getParameter("title"); 
			String content = request.getParameter("content"); 
			int seq =Integer.parseInt(request.getParameter("seq")); 
			
			BoardDAO dao=  new BoardDAO(); 
			BoardVO vo = new BoardVO(); 
			vo.setContent(content);
			vo.setSeq(seq);
			vo.setTitle(title); 
			
			dao.updateBoard(vo);
			
			
			response.sendRedirect("getBoardList.do");
			
			
			
		}else if(path.equals("/deleteBoard.do")){
			System.out.println("�� ���� ó��"); 
			int seq =Integer.parseInt(request.getParameter("seq"));
			BoardVO vo = new BoardVO();
			vo.setSeq(seq);
			
			
			BoardDAO dao = new BoardDAO(); 
			dao.deleteBoard(vo);
			
			response.sendRedirect("getBoardList.do");
			
		}else if(path.equals("/getBoard.do")){
			System.out.println("�� �� ��ȸ ó��");
			
			String seq = request.getParameter("seq"); 
			BoardDAO dao = new BoardDAO(); 
			BoardVO vo = new BoardVO(); 
			vo.setSeq(Integer.parseInt(seq)); 
			
			BoardVO board=dao.getBoaard(vo);
			
			HttpSession session = request.getSession(); 
			
			
			session.setAttribute("board", board);
			response.sendRedirect("getBoard.jsp");
			
			
			
			
		}else if(path.equals("/getBoardList.do")){ 
			
			
			
			System.out.println("�� ����Ʈ ��ȸ ó��");
		
		
		
		
			BoardVO vo =new BoardVO(); 
			BoardDAO boardDAO = new BoardDAO(); 
			List<BoardVO> boardList=  boardDAO.getBoardList(vo); 
			HttpSession session = request.getSession(); 
			session.setAttribute("boardList", boardList);
			response.sendRedirect("getBoardList.jsp");
		
		}
	}

}
*/ 


package com.springbook.view.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet(name = "action", urlPatterns = { "*.do" })
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private HandlerMapping handlerMapping;
  
    private ViewResolver viewResolver;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispatcherServlet() {
        super();
        // TODO Auto-generated constructor stub
    } 
    public void init(){
    	handlerMapping = new HandlerMapping(); 
    	 
    	viewResolver = new ViewResolver();
    	viewResolver.setPrefix("./");
    	viewResolver.setSuffix(".jsp");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("EUC-KR"); 
		process(request,response);
		
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		String uri = request.getRequestURI(); 
		String path = uri.substring(uri.lastIndexOf("/")); 
		System.out.println(path); 
		
		Controller ctrl = handlerMapping.getController(path); //�� �´� ��Ʈ�ѷ� ���� ���� ����
		String viewName = ctrl.handleRequest(request, response); // �����Ͻ� ���� ���� ó��
		String view = null;  
		if(!viewName.contains(".do")){ //do �� ���Ե��� ���� ��� �׳� ���� �ڰ� �ֱ�
			view = viewResolver.getView(viewName); //.jsp ���̴� �� 
			
		}else {
			view = viewName;  //do �� �ܼ��� ������ �̵��� �ƴ϶� ������ ó���ϱ� ���� pojo���� �̵� �� �� do 
		}
		
		response.sendRedirect(view);
	}

}
