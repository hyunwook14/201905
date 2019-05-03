package com.java0503;

public class 구구단 {

	public String goo(int a) {
		String result ="";
		
   	 for(int i =1; i <= a; i++) {
   		 result = result + i + "단" + "<br>";
   		 for(int j = 1; j <10; j++) {
   			 result = result +i + " * " + j + " = " + ( i*j)+"<br>";
   		 }
   		 result = result +"<br>";
   	 }
   	 return result;
    }
    public String goo2() {
    	String result ="";
    	
   	 for(int i = 1; i <= 9; i+=3) {
//   		 System.out.print(i + " 단\t\t");
   		 result = result + i +"단&nbsp&nbsp&nbsp";
//   		 System.out.print((i + 1) + " 단\t\t");
   		result = result + (i+1) +"단\t\t";
//   		 System.out.print((i + 2) + " 단\t\t");
//   		 System.out.println();
   		result = result +(2 +i) +"단\t\t";
   		result = result + "<br>";
   		 for(int j = 1; j <= 9; j++) {
//   			 System.out.print(i + " * " + j + " = " +(i*j) + "\t");
   			result = result +i + " * " + j + " = " +(i*j) + "\t";
//   			 System.out.print((i + 1) + " * " + j + " = " + ((i + 1)*j) + "\t");
   			result = result +(i+1) + " * " + j + " = " +((i+1)*j) + "\t";
//   			 System.out.print((i + 2) + " * " + j + " = " + ((i + 2)*j) + "\t");
   			result = result +(i+2) + " * " + j + " = " +((i+2)*j) + "\t";
//   			 System.out.println();
   			result = result +"<br>";
   		 }
   		 System.out.println();
   		result = result +"<br>";
   	 } 
    return result;
    } 
    public void goo3() {
   	 System.out.println("문제3*************");
   	  	
   	 for(int i = 1; i <= 3; i++) {
   		 System.out.print(i + " 단\t\t");
   		 System.out.print((i + 3) + " 단\t\t");
   		 System.out.print((i + 6) + " 단\t\t");
   		 System.out.println();
   		 for(int j = 1; j <= 9; j++) {
   			 System.out.print(i + " * " + j + " = " + (i*j) + "\t");
   			 System.out.print((i + 3) + " * " + j + " = " + ((i + 3)*j) + "\t");
   			 System.out.print((i + 6) + " * " + j + " = " + ((i + 6)*j) + "\t");
   			 System.out.println();
   		 }
   		 System.out.println();
   	 } 
    } 
}
