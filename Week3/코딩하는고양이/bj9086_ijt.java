import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		for(int i=0; i<A  ;i++) {
			String St = sc.next();
			
			System.out.print(St.charAt(0));
			System.out.println(St.charAt(St.length()-1));
		}

	}

}
