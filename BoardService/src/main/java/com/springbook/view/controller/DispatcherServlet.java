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
			System.out.println("로그인 처리"); 
			
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
			System.out.println("로그아웃 처리");
			HttpSession session = request.getSession(); 
			session.invalidate();
			response.sendRedirect("login.jsp");
			
			
			
		}else if(path.equals("/insertBoard.do")){
			System.out.println("글 등록 처리");
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
			System.out.println("글 수정 처리"); 
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
			System.out.println("글 삭제 처리"); 
			int seq =Integer.parseInt(request.getParameter("seq"));
			BoardVO vo = new BoardVO();
			vo.setSeq(seq);
			
			
			BoardDAO dao = new BoardDAO(); 
			dao.deleteBoard(vo);
			
			response.sendRedirect("getBoardList.do");
			
		}else if(path.equals("/getBoard.do")){
			System.out.println("글 상세 조회 처리");
			
			String seq = request.getParameter("seq"); 
			BoardDAO dao = new BoardDAO(); 
			BoardVO vo = new BoardVO(); 
			vo.setSeq(Integer.parseInt(seq)); 
			
			BoardVO board=dao.getBoaard(vo);
			
			HttpSession session = request.getSession(); 
			
			
			session.setAttribute("board", board);
			response.sendRedirect("getBoard.jsp");
			
			
			
			
		}else if(path.equals("/getBoardList.do")){ 
			
			
			
			System.out.println("글 리스트 조회 처리");
		
		
		
		
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
		
		Controller ctrl = handlerMapping.getController(path); //알 맞는 컨트롤러 구현 가져 오기
		String viewName = ctrl.handleRequest(request, response); // 비지니스 로직 관련 처리
		String view = null;  
		if(!viewName.contains(".do")){ //do 가 포함되지 않은 경우 그냥 떄려 박고 넣기
			view = viewResolver.getView(viewName); //.jsp 붙이는 거 
			
		}else {
			view = viewName;  //do 죽 단순한 페이지 이동이 아니라 로직을 처리하기 위한 pojo로의 이동 일 때 do 
		}
		
		response.sendRedirect(view);
	}

}
