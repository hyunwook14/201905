package com.java0502;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//  기초가 머냐  두개가 머가 다르냐 
//자바는 혼자 만들고 쓴다
//웹은 만드는 사람 따로 있고 사용하는 사람따로있다 -> 서비스해준다(여러사람들이 사용)


@WebServlet("/Main2")
public class Main2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//url : http://localhost:8080/201905/Main2?a=14&b=2&c=？ -> 값은 정수로 볼수있으나 url에서는 문자열(커리스트링)로
		
		String a = request.getParameter("a"); //a 변수 : a = 14;  클라이언트가 url주소로 만들어서 보낸다
		String b = request.getParameter("b"); //b 변수 : b  = 2 ;
		String cc = request.getParameter("c"); //c 변수 : c  = 2 ;
		
		System.out.print(cc);
		
		String c = a+b;
		System.out.println(c); //142
		
		int d = Integer.parseInt(a)+Integer.parseInt(b); //16
		System.out.println(d);
		
		response.getWriter().print(c +", "+ d);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
