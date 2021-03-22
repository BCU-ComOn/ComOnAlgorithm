package com_on;
//³× ¼ö
import java.util.Scanner;

public class bj10824_cjy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		long A = s.nextInt();
		long B = s.nextInt();
		long C = s.nextInt();
		long D = s.nextInt();
		
		String a = String.valueOf(A) + String.valueOf(B);
		String b = String.valueOf(C) + String.valueOf(D);
		
		long c = Long.parseLong(a) + Long.parseLong(b);
		System.out.print(c);
	}
}