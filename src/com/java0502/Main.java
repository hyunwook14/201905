package com.java0502;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main") //  URL : http://localhost:8080/201905/Main
public class Main extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		
		response.setContentType("text/html; charset =UTF-8"); //브라우저 출력시 인코딩
		response.setCharacterEncoding("UTF-8"); //한글로 변경 자바 컴파일할때 인코딩
		
		response.getWriter().print("안녕안녕안녕안녕안녕");  //출력
		
	}



}
