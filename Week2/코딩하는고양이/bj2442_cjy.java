package com_on;
//º° Âï±â
import java.util.Scanner;

public class bj2442_cjy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		int i, j, k;
		int num = s.nextInt();
		
		for (i = 0 ; i < num; i++) {
			for (j = 1; j < num-i; j++) {
				System.out.print(" ");
			}
			for (k = 0 ; k < i *2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
