import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int S = s.nextInt();
		for(int r= 0; r < S; r++) {
			int R = s.nextInt();
			String T = s.next();
			
			for(int I = 0 ; I < T.length(); I++) {
				for(int Z=0; Z<R; Z++) {
					System.out.print(T.charAt(I));
				}
			}
			System.out.println();
}
}
}