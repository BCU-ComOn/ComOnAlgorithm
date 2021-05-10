package com_on;

import java.util.Scanner;

public class bj14656_cjy_ijt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int sum = 0;
		int arr[] = new int[n];
		
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = 1+i;
			if(arr[i] != in.nextInt()) {
				sum +=1;
			}
		}
		System.out.println(sum);
	}
}
