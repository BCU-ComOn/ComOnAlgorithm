package com_on;

import java.util.Scanner;

public class bj4435_cjy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		
		int[] goodSide = {1,2,3,3,4,10};
		int[] badSide = {1,2,2,2,3,5,10};
		
		for(int i=1; i<=value; i++) {
			int good = 0; 
			int bad = 0;
			
			for(int j = 0; j<goodSide.length; j++) {
				good += sc.nextInt() * goodSide[j];
			}
			
			
			for(int k=0; k<badSide.length; k++) {
				bad += sc.nextInt() * badSide[k];
			}
			
			if(good>bad) {
				System.out.println("Battle "+ i +": Good triumphs over Evil");
			}
			else if (good<bad) {
				System.out.println("Battle "+ i +": Evil eradicates all trace of Good");
			}
			else {
				System.out.println("Battle "+ i +": No victor on this battle field");
			}
		}
	}

}
