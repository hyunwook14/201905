<%@page import="java.util.Enumeration"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.java0503.사용자" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!	List<사용자> 사용자목록 = new ArrayList<사용자>();
int age =0; int height =0; int weight =0; boolean flag =false;
%>
<%
	
	response.setContentType("text/html; charset = utf-8");
	response.setCharacterEncoding("utf-8");

	//사용자 입력
	
	String 이름2 =request.getParameter("name2");
	
	int count =0;
	
	/* Enumeration<String> params = request.getParameterNames();
	while(params.hasMoreElements()){
		count++;
	} */
	
	if(count ==4){
	String 이름 = request.getParameter("name");
	age =Integer.parseInt(request.getParameter("age"));
	height = Integer.parseInt(request.getParameter("height"));
	weight = Integer.parseInt(request.getParameter("weight"));
	사용자목록.add(new 사용자(이름,age,height,weight));

	}else if(count ==1){
	//사용자 검색
	for(int i =0; i< 사용자목록.size(); i++){
		if(이름2.equals(사용자목록.get(i).get이름()))
		response.getWriter().print(사용자목록.get(i).get이름());
	}
	}else{
		System.out.println("실패하였습니다.");
	}

%>

</body>
</html>