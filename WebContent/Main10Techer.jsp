<%@page import="com.java0508.Test1Interface"%>
<%@page import="com.java0508.Test"%>
<%@page import="com.java0508.TestInterface"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
//자바영역
	TestInterface ti;
	//ti = new TestInterface(); //인터페이스는 생성자가 없다.
	ti = new Test();
	int result =ti.add(); //돌아오는값이 정수형
	//ti.pirnt()// 인터페이스에 있지 않은 메소드이기 때문에 사용불가
	Test1Interface t1i = new Test();
	t1i.add(10);
	
	Test t = new Test();
	t.add();
	t.add(10);
	t.print();

%>
<%= result %> <!--  변수값 출력 -->