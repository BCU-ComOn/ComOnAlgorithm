package com_on;
//영수증
import java.util.Scanner;

public class bj5565_cjy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);	
		int[] num = new int[9];
		int T = s.nextInt();
		
		for(int i=0; i< num.length; i++) {
			num[i] = s.nextInt();
			T -= num[i];
		}	
		System.out.println(T);
	}
}
