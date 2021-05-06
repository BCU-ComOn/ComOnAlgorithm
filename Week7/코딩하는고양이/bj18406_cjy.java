package com_on;
// 럭키 스트레이트
import java.util.Scanner;

public class bj18406_cjy {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String left;
		String right;
		
		int Lresult = 0;
		int Rresult = 0;
		
		String Ns = Integer.toString(N);
		int num = Ns.length()/2;
		
		left = Ns.substring(0,num);
		right = Ns.substring(num, Ns.length());
		
		for(int i=0; i<num ; i++) {
			Lresult +=(int)left.charAt(i);
		}
		for(int i=0; i<num ; i++) {
			Rresult +=(int)right.charAt(i);
		}
		if(Lresult == Rresult)
			System.out.println("LUCKY");
		else
			System.out.println("READY");
	}
}
