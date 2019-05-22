package com.java0508;

import java.util.ArrayList;
import java.util.List;

public class Main11 implements Main11Interface {
	
	
	
	@Override
	public boolean 학생추가(Student stu) {
		// TODO Auto-generated method stub
		
		Util.save.add(stu);
		System.out.println("추가완료");
		return true;
	}

	@Override
	public Student 학생검색(String name) {
		// TODO Auto-generated method stub
		Student st = null;	
		for(int i =0; i<Util.save.size(); i++) {
		if(name.equals(Util.save.get(i).getName())) {
			st = Util.save.get(i);
		}
		}
		
		
		return st;
	}

	@Override
	public boolean 학생수정(Student stu) {
		// TODO Auto-generated method stub
		
		System.out.println("수정성공");
		return true;
	}

	@Override
	public boolean 학생삭제(Student stu) {
		// TODO Auto-generated method stub
		return false;
	}

}
