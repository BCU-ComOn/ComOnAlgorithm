package com_on;

import java.util.Scanner;

public class bj10214_cjy_ijt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		int num1 = 0, num2 =0;
		int sum1 = 0, sum2 =0;
		for(int i = 0 ; i<num; i++) {
			for(int j = 0 ; j<9; j++) {
				num1 = in.nextInt();
				num2 = in.nextInt();
				
				sum1 += num1;
				sum2 += num2;
				
			}
			if(sum1 == sum2) {
				System.out.println("Draw");
			}
			else if(sum1 < sum2) {
				System.out.println("Korea");
			}
			else if(sum1 > sum2) {
				System.out.println("Yonsei");
			}
		}
	}

}
