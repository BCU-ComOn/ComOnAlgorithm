package BJ_Algorithm;
import java.util.Scanner;

public class bj_2953_JHI {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int winner = 0;
		int winscore = 0;
		int total = 0;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4; j++) {
				int score = s.nextInt();
				total += score;
			}
			if(winscore < total) {
				winscore = total;
				winner = i+1;
			}
			total = 0;
		}
		System.out.println(winner + " " + winscore);
	}
}
