package BJ_Algorithm;
import java.util.Scanner;

public class bj_2884_JHI {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int H = s.nextInt();
		int M = s.nextInt();
		
		M -= 45;
		if(M < 0) {
			M = 60 + M;
			H -= 1;
		}
		if(H < 0) {
			H = 24 + H;
		}
		System.out.println(H + " " + M);
	}
}
