package com.java0503;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Main7")
public class Main7 extends HttpServlet {
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		
		response.setContentType("text/html; charset = utf-8");
		response.setCharacterEncoding("utf-8");
		
		String name =request.getParameter("name");
		String age =request.getParameter("age");
		String height = request.getParameter("height");
		String weight = request.getParameter("weight");
		

		
		List<사용자>  사용자목록= new ArrayList<사용자>();
		String html ="";
		사용자목록.add(new 사용자(name, Integer.parseInt(age), Integer.parseInt(height), Integer.parseInt(weight)));
			
		
		
		for (int i =0; i<사용자목록.size(); i++) {
			html += 사용자목록.get(i).get이름()+"<br>"+사용자목록.get(i).get나이()+"<br>"+사용자목록.get(i).get키()+"<br>"+사용자목록.get(i).get몸무게()+"<br>";
		}
	   response.getWriter().print(html);
	   response.getWriter().print("<a href = http://localhost:8080/201905> 돌아가기 <a>");
		
		
		
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
