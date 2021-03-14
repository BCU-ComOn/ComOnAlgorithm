package com_on;
//홀수
import java.util.Scanner;

public class bj2576_cjy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] score = new int[7];
		
		int sum = 0;
		int min = 100;
		int count = 7;
		
		for(int i=0; i< score.length; i++) {
			score[i] = s.nextInt();	
			
			if (score[i] %2 ==1) {
				sum += score[i];
				count -= 1;
				if (min>score[i]) {
					min = score[i];
				}
			}
		}
		if (count ==7) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
