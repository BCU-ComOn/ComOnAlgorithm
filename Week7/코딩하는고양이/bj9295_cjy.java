package com_on;
// 주사위
import java.util.Scanner;

public class bj9295_cjy {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int i=0; i<T; i++) {
			int num1 = in.nextInt();
			int num2 = in.nextInt();
			System.out.println("Case " + (i+1) + ": " + (num1 + num2));	
		}
	}
}
