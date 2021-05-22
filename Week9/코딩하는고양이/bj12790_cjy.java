package com_on;
// Mini Fantasy War
import java.util.Scanner;

public class bj12790_cjy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int T = s.nextInt(); 
		for(int i=0; i<T; i++) {
			int [] array = new int[8];
			int sum = 0;
			
			for(int j=0; j<array.length; j++) {
				array[j] = s.nextInt();
			}
			
			for(int k=0; k<4; k++) {
				array[k] = array[k] + array[k+4];
			}
			
			if(array[0] < 1)
				array[0] = 1;
			if(array[1] < 1)
				array[1] = 1;
			if(array[2] < 0)
				array[2] = 0;
			
			sum += 1*array[0] + 5*array[1] + 2*array[2]+ 2*array[3];
			System.out.println(sum);
		}
	}
}
