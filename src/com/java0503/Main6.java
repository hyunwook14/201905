package com.java0503;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main6")
public class Main6 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		사용자 유저 = new 사용자();
//		유저.나이 = 5;
//		유저.이름 ="윌리엄스";
//		유저.키 =189;
//		유저.키 = 100;
//		유저.set이름("윌리엄스");
////	String 이름 = 유저.get이름();
		
//		사용자 구디 =new 사용자("윌리엄스", 19, 189, 100);
//		사용자 가산 =new 사용자("자이언", 10, 199, 110);
//		
//		if(구디.get나이() > 가산.get나이()) {
//			System.out.println("구디");
//		}else {
//			System.out.println("가산");
//		}
		
		//유동적이고 데이터를 그룹으로 만들때 사용한다 배열과 비슷하지만 순서가 없고 키로 사용
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("이름", "구디");
		resultMap.put("나이", "1");
		resultMap.put("키", "190");
		resultMap.put("몸무게", "100");
		resultMap.put("학교", "구디아카데미");
		
		String 이름 =resultMap.get("이름").toString();
		System.out.println(이름);
		
		List<사용자> 사용자목록 = new ArrayList<사용자>();     //배열
		사용자목록.add(new 사용자("윌리엄스", 19, 189, 100)); //0번 인덱스 위치에 사용자 객체 담기
		사용자목록.add(new 사용자("자이언", 10, 199, 110));   //1번 인덱스 위치에 사용자 객체 담기
		
		if(사용자목록.get(0).get나이()> 사용자목록.get(1).get나이()) {
			System.out.print(사용자목록.get(0).get이름());
		}else {
			System.out.print(사용자목록.get(1).get이름());
		}
		
		사용자 구디 =사용자목록.get(0);
		사용자 가산 =사용자목록.get(1);
		
		if(구디.get나이() > 가산.get나이()) {
			System.out.println("구디");
		}else {
			System.out.println("가산");
		}
		
		List 정수형리스트 = new ArrayList();
		정수형리스트.add(1);
		정수형리스트.add("2");
		정수형리스트.add(3.4);
		정수형리스트.add(true);
		
		for(int i = 0; i < 정수형리스트.size(); i++) {
			System.out.println(정수형리스트.get(i));
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
