package BJ_Algorithm;
import java.util.Scanner;

public class bj_2441_JHI {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int width = s.nextInt();
		
		for(int i = 0; i < width; i++) {
			for(int j = 0; j < width; j++) {
				if(j >= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
