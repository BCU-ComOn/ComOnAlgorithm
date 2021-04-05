package com_on;
import java.util.*;
import java.util.Arrays;
public class bj2750_cjy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		Integer[] num;
		num = new Integer[N];
		
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		
		for(int i : num) {
			System.out.println(i);

		}
	}
}
