package com_on;
//10∫Œ¡¶
import java.util.Scanner;

public class bj10797_cjy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		int count = 0;
		int d= s.nextInt();
		int[] car = new int[5];
		
		for(int i=0; i< car.length; i++) {
			car[i] = s.nextInt();
			if (d == car[i]) {
				count += 1;
			}
		}	
		System.out.print(count);
	}

}
