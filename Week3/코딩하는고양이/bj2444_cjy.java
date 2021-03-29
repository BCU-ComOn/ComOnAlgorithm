package com_on;
// 별찍기 7
import java.util.Scanner;

public class bj2444_cjy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 0; j < num-i; j++)
				System.out.print(" ");
			
			for(int k = 0; k < i*2-1; k++)
				System.out.print("*");
			
			System.out.println();
		}
		
		for(int I = num -1; I >= 1; I--) {
			for(int J = 0; J < num-I; J++)
				System.out.print(" ");
			
			for(int K = 0; K < I*2-1; K++)
				System.out.print("*");
			
			System.out.println();
		}
	}
}
