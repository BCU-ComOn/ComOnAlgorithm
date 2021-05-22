package com_on;
// 사분면 고르기
import java.util.Scanner;

public class bj14681_cjy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x= s.nextInt();
		int y= s.nextInt();
		
		if(x>0) {
			if(y>0) 
				System.out.println("1");
			else
				System.out.println("4");
		}
		else {
			if(y>0)
				System.out.println("2");
			else
				System.out.println("3");
		}
	}
}