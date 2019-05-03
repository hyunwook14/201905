package com.java0502;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main3")
public class Main3 extends HttpServlet {
	String add ="add";
	 			
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String name =request.getParameter("name");
//		String age = request.getParameter("age");
		calculator 계산기 = new calculator();
		response.setContentType("text/html; charset =UTF-8"); //브라우저 출력시 인코딩
		response.setCharacterEncoding("UTF-8"); //한글로 변경 자바 컴파일할때 인코딩
		
//		String html ="";
//		html = html+"이름 : "+name+"<br>";
//		html = html+"나이 : "+age+"<br>";
//		html = html+"<a href = http://localhost:8080/201905/> 처음으로 </a>";
//		response.getWriter().print(html);
		
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String method = request.getParameter("method");
		
		float result = 0; 

		if(method.equals("add")) {
			result =계산기.add(Integer.parseInt(a), Integer.parseInt(b));
		}else if(method.equals("sub")){
			result =계산기.sub(Integer.parseInt(a), Integer.parseInt(b));
		}else if(method.equals("mul")) {
			result =계산기.mul(Integer.parseInt(a), Integer.parseInt(b));
		}else if(method.equals("div")){
			result =계산기.div(Integer.parseInt(a), Integer.parseInt(b));
		}
		
		response.getWriter().print(result);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
	
	}

}
