<%@page import="com.study.jsp.ioc.Factory"%>
<%@page import="com.study.jsp.srv.BoardService"%>
<%@page import="com.study.jsp.model.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	
	int seq = 0;
	
	String seq_ = request.getParameter("seq");
	if(!seq_.isEmpty()){
		seq = Integer.valueOf(seq_);
	}
	
	BoardDTO dto = new BoardDTO();
	dto.setTitle(title);
	dto.setContent(content);
	dto.setSeq(seq);
	
	BoardService boardSrv = Factory.INSTANCE.getBoardSrv();
	boardSrv.update(dto);
	
	response.sendRedirect("./list.jsp");

%>