package com.java0502;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/main4")
public class Main4 extends HttpServlet {
	
	calculator 계산기 = new calculator();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String c = request.getParameter("method");
	
		response.setContentType("text/html; charset= utf-8");
		response.setCharacterEncoding("utf-8");
		
		
		
		float result =0 ;
		
		switch(c) {
		case "add":
			result =계산기.add(Integer.parseInt(a), Integer.parseInt(b));
			
			break;
		case "sub":
			result = 계산기.sub(Integer.parseInt(a), Integer.parseInt(b));
			
			break;
		case "mul":
			result = 계산기.mul(Integer.parseInt(a), Integer.parseInt(b));
			break;
			
		case "div":
			result = 계산기.div(Integer.parseInt(a), Integer.parseInt(b));
			break;
		
		}
		System.out.println(result);
		response.getWriter().print(c+"한 결과값은 "+result);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
