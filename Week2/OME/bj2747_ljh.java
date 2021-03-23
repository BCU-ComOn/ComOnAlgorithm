import java.util.Scanner;

public class bj2747_ljh {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n = in.nextInt();
		int f1 = 0;
		int f2 = 1;
		int f3 = 1;
		
		for(int i = 2; i <= n; i++) {
		f3 = f2+f1;
		f1 = f2;
		f2 = f3;
		}
		System.out.println(f3);
	}

}