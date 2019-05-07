package com.java0503;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Main7")
public class Main7 extends HttpServlet {
	
	List<사용자>  사용자목록= new ArrayList<사용자>();
	
	//     ?   사용가능하나  Object 형식으로 바뀜
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset = utf-8");
		response.setCharacterEncoding("utf-8");
		
		String name =request.getParameter("name");
		String age =request.getParameter("age");
		String height = request.getParameter("height");
		String weight = request.getParameter("weight");
		사용자목록.add(new 사용자(name, Integer.parseInt(age), Integer.parseInt(height), Integer.parseInt(weight)));
	    response.getWriter().print("<a href = http://localhost:8080/201905> 돌아가기 <a>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset= utf-8");  
		
//		String html ="";
//		for (int i =0; i<사용자목록.size(); i++) {
//			html += 사용자목록.get(i).get이름()+"<br>"+사용자목록.get(i).get나이()+"<br>"+사용자목록.get(i).get키()+"<br>"+사용자목록.get(i).get몸무게()+"<br>";
//		}
//	   response.getWriter().print(html);

		
		//파라메터 확인
		Enumeration<String> params = request.getParameterNames();
		//Enumeration<?> params = request.getParameterNames(); 물음표도 사용가능
		//          왜 스트링인가?  겟이랑 포스트에서 사용가능한데 왜?
		//          url 주소로 어떤값을 보내기 위한거라 url은 문자열로 String을 사용 
	    while(params.hasMoreElements()) {
	    	System.out.println(params.nextElement());
	    }
		
	    //문제 발생하는데 post 에서는 파라미터 이름이 한글일떄는 깨질 수 있음
		response.getWriter().print("성공 : "+사용자목록.size()+"<br>");
		String 이름 = request.getParameter("name");
		System.out.println("1");
		boolean check = true;
		for(int i = 0; i < 사용자목록.size(); i++) {
			System.out.println("2");
//			response.getWriter().print(사용자목록.get(i));
	        //비교
	         if(사용자목록.get(i).get이름().equals(이름)){
	        	 System.out.println("2-1");
	            response.getWriter().print("이름 :"+사용자목록.get(i).get이름()+"<br>");
	            response.getWriter().print("나이 :"+사용자목록.get(i).get나이()+"<br>");
	            response.getWriter().print("키 :"+사용자목록.get(i).get키()+"<br>");
	            response.getWriter().print("몸무게:"+사용자목록.get(i).get몸무게()+"<br>");
	            check = false;
	        }      
		}
		System.out.println("3");
		if(check) {
			response.getWriter().print("검색한 이름: "+이름 +"은 사용자 목록에 없습니다.");
		}
	}

}
