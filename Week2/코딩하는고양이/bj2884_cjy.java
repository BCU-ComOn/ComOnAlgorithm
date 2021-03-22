package com_on;
//알람시계
import java.util.Scanner;

public class bj2884_cjy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		
		int H = s.nextInt();
		int M = s.nextInt();
		
		int h = H;
		int m = M-45;
			
		if(m < 0) {
			h = H -1;
			m = 60 + m;
		}
		if(h < 0) {
			h = 23;
		}
		System.out.print(h + " " + m);
	}
}
