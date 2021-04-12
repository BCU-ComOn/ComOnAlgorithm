package com_on;
// 짝수를 찾아라
import java.util.Scanner;

public class bj3058_cjy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		
		for(int i=0; i < T; i++) {
			int sum = 0;
			int min = 100;
			
			for(int j=0; j < 7; j++) {
				int[] num= new int[7];
				num[j] = s.nextInt();
				if (num[j] % 2 == 0) {
					sum += num[j];
					if(num[j] < min){
						min = num[j];
					}
				}
			}
			System.out.println(sum + " " + min);
		}
	}
}
