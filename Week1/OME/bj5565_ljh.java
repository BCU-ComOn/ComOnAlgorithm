import java.util.Scanner;

public class bj5565_ljh {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int total = 0;
		int num = 0;
		int knownbook = 0;
		
		total = in.nextInt();
		
		for (int i = 1; i < 10; i++) {
			num = in.nextInt();
			knownbook += num;
		}
		System.out.println(total-knownbook);
	}
}