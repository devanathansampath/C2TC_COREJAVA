package com.tns.ifet.day2;

public class TypeCastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 9; 
		  int i = b; 
		  System.out.println(i); 
		   
		  float f = 2.11f; 
		  double d = f; 
		  System.out.println(d); 
		   
		  char ch = 'M'; 
		  int i3 = ch; 
		  System.out.println(i3); 
		   
		  char var1 = '\u00A7'; 
		  int i4 = var1; 
		  System.out.println(i4); 
		   
		  // narrowing/explicit type casting 
		 
		  double f1 = 11.29f; 
		  long l = (long) f1; 
		  System.out.println(l); 
		 
		  long l1 = 923372036854722226l; 
		  int i2 = (int) l1; 
		  System.out.println(i2); 
		 
		  float f2 = 34.56f; 
		  int i1 = (int) f2; 
		  System.out.println(i1); 
		 
		  byte b1 = 100; 
		  char ch1 = (char) b1; 
		  System.out.println(ch1); 

	}

}
