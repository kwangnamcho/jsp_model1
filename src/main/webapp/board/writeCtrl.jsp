<%@page import="com.study.jsp.model.BoardDTO"%>
<%@page import="com.study.jsp.ioc.Factory"%>
<%@page import="com.study.jsp.srv.BoardService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<%
	String userid = request.getParameter("userid");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String nickname = request.getParameter("nickname");	
	
	BoardDTO dto = new BoardDTO();
	dto.setUserid(userid);
	dto.setTitle(title);
	dto.setContent(content);
	dto.setNickname(nickname);
	
	BoardService boardSrv = Factory.INSTANCE.getBoardSrv();
	boardSrv.save(dto);
	
	response.sendRedirect("./list.jsp");
	
%>