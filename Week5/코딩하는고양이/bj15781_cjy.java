package com_on;
// 헬멧과 조끼
import java.util.Scanner;

public class bj15781_cjy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		
		long Nmax=0;
		long Mmax=0;
		
		for(int i=0; i<N; i++) {
			long n = s.nextInt();
			if (Nmax < n) {
				Nmax = n;
			}
		}
		
		for(int j=0; j<M; j++) {
			long m = s.nextInt();
			if (Mmax < m) {
				Mmax = m; 
			}
		}
		System.out.println(Nmax+Mmax);
	}
}
