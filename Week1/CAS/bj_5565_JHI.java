package BJ_Algorithm;
import java.util.Scanner;

public class bj_5565_JHI {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int total = s.nextInt();
		
		for(int i = 0; i < 9; i++) {
			int price = s.nextInt();
			total -= price;
		}
		System.out.println(total);
	}
}
