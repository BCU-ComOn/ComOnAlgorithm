package BJ_Algorithm;
import java.util.Scanner;

public class bj_2747_JHI {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int result = 0;
		int p = 0;
		int p1 = 1;
		
		for(int i = 0; i <= n; i++) {
			if(i == 0) {
				result = p;
			} else if(i == 1){
				result = p1;
			} else {
				result = p + p1;
				p = p1;
				p1 = result;
			}
		}
		System.out.println(result);
	}
}
