package com.tns.ifet.day2;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x = 'X'; 
		  switch (x)  
		  { 
		  case 'x' :  
		  case 'X' :  
		   System.out.println(x+" is a Letter"); 
		   break; 
		  case 'd': 
		  case 'D' : 
		   System.out.println(x+" is a Digit"); 
		   break; 
		  case 'w': 
		  case 'W' :  
		   System.out.println(x+" is White Space"); 
		   break; 
		  case 's': 
		  case 'S': 
		   System.out.println(x+" is Special Symbol"); 
		  default: 
		   System.out.println(x+" is other than letter, digit, space or special symbol "); 
		   break; 
		  }

	}

}