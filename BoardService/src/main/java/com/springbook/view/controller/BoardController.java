/*package com.springbook.view.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller 
@SessionAttributes("board")
public class BoardController {

	public BoardController() {
		// TODO Auto-generated constructor stub
	}
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap(){
		Map<String,String> conditionMap = new HashMap<String,String>(); 
		conditionMap.put("제목", "TITLE"); 
		conditionMap.put("내용","content"); 
		return conditionMap;
	}
	
	@RequestMapping("/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO dao ){
		
		dao.insertBoard(vo);
		
		return "redirect:getboardList.do";
	}
	

	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO dao  ){
		System.out.println(vo.getCnt());
		System.out.println(vo.getContent());
		System.out.println(vo.getSeq());
		
		System.out.println(vo.getTitle());
		System.out.println(vo.getWriter());
		System.out.println(vo.getRegDate());
		dao.updateBoard(vo);
		
		return "redirect:getBoard.do?seq="+vo.getSeq();
	}
	

	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO dao ){
		
		dao.deleteBoard(vo);
		
		return "redirect:deleteBoard.do?seq="+vo.getSeq();
	}

	
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, BoardDAO dao , Model mav){
		
		
		mav.addAttribute("board",dao.getBoaard(vo)); 
	
		
		
		return "getBoard.jsp";
	}
	

	@RequestMapping("/getBoardList")
	public String getBoardList(BoardVO vo, BoardDAO dao , Model mav){
		
		
		mav.addAttribute("boardList",dao.getBoardList(vo));
		
		return "getBoardList.jsp";
	}
	

	@RequestMapping("/getBoardList.do")
	public String getBoardList(@RequestParam(value="searchCondition" , defaultValue="TITLE", required=false) String condition, 
			@RequestParam(value="searchKeyword", defaultValue="", required=false ) String keyword, BoardDAO dao, Model model,BoardVO vo){
		
		System.out.println("검색 조건: "+ condition);
		System.out.println("검색 단어 :" + keyword); 
		
		model.addAttribute("boardList",dao.getBoardList(vo));
		
		return "getBoardList.jsp";
	}
	
	@RequestMapping("/getBoardList.do")
	public String getBoardList(@RequestParam(value="searchCondition" , defaultValue="TITLE", required=false) String condition, 
			@RequestParam(value="searchKeyword", defaultValue="", required=false ) String keyword, BoardDAO dao, Model model,BoardVO vo){
		
		System.out.println("검색 조건: "+ condition);
		System.out.println("검색 단어 :" + keyword); 
		
		model.addAttribute("boardList",dao.getBoardList(vo));
		
		return "getBoardList.jsp";
	}
	
}
*/



package com.springbook.view.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller 
@SessionAttributes("board")
public class BoardController {
	
	
	@Autowired
	private	BoardService service; 
	public BoardController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/dataTramsform.do")
	@ResponseBody
	public List<BoardVO> dataTransform(BoardVO vo){
		
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		List<BoardVO> boardList= service.getBoardList(vo); 
		return boardList;
		
	}
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap(){
		Map<String,String> conditionMap = new HashMap<String,String>(); 
		conditionMap.put("제목", "TITLE"); 
		conditionMap.put("내용","content"); 
		return conditionMap;
	}
	
	@RequestMapping("/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO dao )throws IOException{
		
		MultipartFile uploadfile = vo.getUploadFile(); 
		if(!uploadfile.isEmpty()){
			String fileName=uploadfile.getOriginalFilename(); 
			uploadfile.transferTo(new File("D:/"+fileName));
		}
		
		service.insertBoard(vo);
		
		return "redirect:getBoardList.do";
	}
	

	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO dao  ){
		System.out.println(vo.getCnt());
		System.out.println(vo.getContent());
		System.out.println(vo.getSeq());
		
		System.out.println(vo.getTitle());
		System.out.println(vo.getWriter());
		System.out.println(vo.getRegDate());
		service.updateBoard(vo);
		
		return "redirect:getBoard.do?seq="+vo.getSeq();
	}
	

	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO dao ){
		
		service.deleteBoard(vo);
		
		return "redirect:deleteBoard.do?seq="+vo.getSeq();
	}

	
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, BoardDAO dao , Model mav){
		
		
		mav.addAttribute("board",service.getBoard(vo)); 
	
		
		
		return "getBoard.jsp";
	}
	
/*
	@RequestMapping("/getBoardList")
	public String getBoardList(BoardVO vo, BoardDAO dao , Model mav){
		
		
		mav.addAttribute("boardList",dao.getBoardList(vo));
		
		return "getBoardList.jsp";
	}*/
	

	/*@RequestMapping("/getBoardList.do")
	public String getBoardList(@RequestParam(value="searchCondition" , defaultValue="TITLE", required=false) String condition, 
			@RequestParam(value="searchKeyword", defaultValue="", required=false ) String keyword, BoardDAO dao, Model model,BoardVO vo){
		
		System.out.println("검색 조건: "+ condition);
		System.out.println("검색 단어 :" + keyword); 
		
		model.addAttribute("boardList",dao.getBoardList(vo));
		
		return "getBoardList.jsp";
	}*/
	
	/*@RequestMapping("/getBoardList.do")
	public String getBoardList(@RequestParam(value="searchCondition" , defaultValue="TITLE", required=false) String condition, 
			@RequestParam(value="searchKeyword", defaultValue="", required=false ) String keyword, BoardDAO dao, Model model,BoardVO vo){
		
		System.out.println("검색 조건: "+ condition);
		System.out.println("검색 단어 :" + keyword); 
		
		
		
		
		model.addAttribute("boardList",service.getBoardList(vo));
		
		return "getBoardList.jsp";
	}*/
	
	
	@RequestMapping("/getBoardList.do")
	public String getBoardList(  Model model,BoardVO vo){
		
		
		
		
		if(vo.getSearchCondition()==null) vo.setSearchCondition("TITLE");
		if(vo.getSearchKeyword()==null) vo.setSearchKeyword("");
		System.out.println("검색 조건: "+ vo.getSearchCondition());
		System.out.println("검색 단어 :" + vo.getSearchKeyword()); 
		model.addAttribute("boardList",service.getBoardList(vo));
		
		return "getBoardList.jsp";
	}
	
}
