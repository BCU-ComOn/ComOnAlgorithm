package com_on;
//피보나치 수
import java.util.Scanner;

public class bj2747_cjy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		int r = 0;
		int a = 0; int b = 1;
		int S = s.nextInt();
		
		if (S==1) {
			System.out.print(1);
		}
		else {
			for (int i = 1; i < S; i++) {
				r = a + b;
				a = b;
				b = r;
			}
			System.out.print(r);
		}
	}
}
