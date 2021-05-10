package com_on;

import java.util.Scanner;

public class bj8958_cjy_ijt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String ox;
		int sum =1;
		int result = 0;
		for(int i=0; i<num; i++) {
			ox = in.next();
			String[] strArr = ox.split("");
			for(int j=0; j< strArr.length; j++) {
				if (j > 0) {
					if(strArr[j].equals(strArr[j-1])&& strArr[j].equals("O")) {
						sum += 1;
						
					}
				}
				if(strArr[j].equals("O")) {
					result += sum;
				}
				if (strArr[j].equals("X")) {
					sum = 1;
				}
				
			}
			System.out.println(result);
			result = 0;
			sum = 1;
		}
	}
}