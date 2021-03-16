package BJ_Algorithm;
import java.util.Scanner;

public class bj_10797_JHI {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int day = s.nextInt();
		int result = 0;
		
		for(int i = 0; i < 5; i++) {
			int one = s.nextInt();
			if(day == one) {
				result++;
			}
		}
		System.out.println(result);
	}
}
