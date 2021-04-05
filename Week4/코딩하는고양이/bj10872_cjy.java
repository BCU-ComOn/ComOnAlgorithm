package com_on;

import java.util.Scanner;

public class bj10872_cjy {

	public static void main(String[] args) {
		int n;
		int result = 1;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			result= i *result;
		}
		System.out.println(result);
	}

}
