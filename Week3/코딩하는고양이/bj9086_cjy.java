package com_on;
// 문자열
import java.util.Scanner;

public class bj9086_cjy {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int count= s.nextInt();
	    
		for(int i=0; i<count; i++) {
	    	String Str = s.next();
	          
	        System.out.print(Str.charAt(0));
	        System.out.println(Str.charAt(Str.length()-1));
	    }
	}
}
