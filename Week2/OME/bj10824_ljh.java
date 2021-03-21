import java.util.Scanner;

public class bj10824_ljh {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long AB = 0;
		long CD = 0;
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();
		
		String a = String.valueOf(A);
		String b = String.valueOf(B);
		String c = String.valueOf(C);
		String d = String.valueOf(D);
		
		String ab = a+b;
		String cd = c+d;
		
		AB = Long.valueOf(ab);
		CD = Long.valueOf(cd);
		
		System.out.println(AB+CD);

	}

}
