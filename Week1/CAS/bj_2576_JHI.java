package BJ_Algorithm;
import java.util.Scanner;

public class bj_2576_JHI {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int result = 0;
		int mini = -1;
		
		for(int i = 0; i < 7; i++) {
			int j = s.nextInt();
			
			if(j%2!=0) {
				result += j;
				if(mini == -1) {
					mini = j;
				}
				if(mini > j) {
					mini = j;
				}
			}
		}
		if(mini == -1) {
			System.out.println(mini);
		} else {
			System.out.println(result);
			System.out.println(mini);
		}
	}
}
