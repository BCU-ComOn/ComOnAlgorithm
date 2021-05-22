package com_on;
// 문자열 분석
import java.util.Scanner;

public class bj10820_cjy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNextLine()) {
			int num1=0;
			int num2=0;
			int num3=0;
			int num4=0;
			
			String str = s.nextLine();
			for(int i=0; i<str.length();i++) {
				char strChar = str.charAt(i);
				if('a'<=strChar && 'z'>=strChar)
					num1++;
				else if('A'<=strChar && 'Z'>=strChar)
					num2++;
				else if('0' <=strChar && strChar <='9')
					num3++;
				else if(strChar == ' ')
					num4++;
			}
			System.out.println(num1 + " " + num2 +" " + num3 + " " + num4);
		}
	}
}