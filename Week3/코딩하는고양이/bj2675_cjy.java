package com_on;
// 문자열 반복
import java.util.Scanner;

public class bj2675_cjy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		for(int i= 0; i < num; i++) {
			int C = s.nextInt();
			String T = s.next();
			
			for(int j = 0; j < T.length(); j++) {
				for(int k = 0; k < C; k++) {
					System.out.print(T.substring(j, j+1));
				}
			}
			System.out.println();
		}
	}
}
