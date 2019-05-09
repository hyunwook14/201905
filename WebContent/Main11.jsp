<%@page import="java.util.Enumeration"%>
<%@page import="com.java0508.Main11"%>
<%@page import="com.java0508.Main11Interface"%>
<%@page import="com.java0508.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%! boolean flag = false; %>
<%
	int count =0;
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	String name2 = request.getParameter("name2");
	
	Student stu = new Student(name, gender, id, pw);
	Student stu2 ;
	
	Main11Interface management = new Main11();
	
	
	
		
	Enumeration<String> params = request.getParameterNames();
	while(params.hasMoreElements()) {
    	System.out.println(params.nextElement());
    	count++;
    }
	System.out.println(count);
	if(count==4){
		flag = management.학생추가(stu);
	}else if(count ==1){
		stu2 = management.학생검색(name2);
		response.getWriter().print(stu2.toString());
	}
	//System.out.println(flag);

    

%>