package com.java0503;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main5")
public class Main5 extends HttpServlet {
	
	구구단 구구단 = new 구구단();
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset = utf-8");
		response.setCharacterEncoding("utf-8");
		
		String result ="";

//		result = 구구단.goo(9);
		result = 구구단.goo2();

    	 response.getWriter().print(result);
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
