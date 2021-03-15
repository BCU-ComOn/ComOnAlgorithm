package com_on;
//별찍기
import java.util.Scanner;

public class bj2441_cjy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int sum = s.nextInt();
		
		for (int i = 0; i < sum; i++) {
			for (int j = 0; j< i; j++) {
				System.out.print(" ");
			}
			for (int j = sum - 1; j >=i; j--) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
