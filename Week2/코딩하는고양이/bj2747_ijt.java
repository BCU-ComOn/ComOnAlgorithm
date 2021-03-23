import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		int F1=0;
		int F=1;
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			result = F1 + F;
			F = F1;
			F1 = result;		
		}
		System.out.print(result);
	}
}
