package com_on;
//나는 요리사다
import java.util.Scanner;

public class bj2953_cjy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int max = 5;
		int rank = 0;
		for (int i=0; i < 5; i++) {
			int sum= 0;
			for (int j=0;j<4; j++) {
				int score = s.nextInt();
				sum += score;
				if(max<=sum) {
					max = sum;
					rank = i+1;
				}
			}
		}
		System.out.print(rank+ " " +max);
	}
}
