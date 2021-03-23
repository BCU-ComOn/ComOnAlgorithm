import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int H;
		int M;
		
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		M = sc.nextInt();
        
		if(H==0 && M < 45 ) {
			H = 23;
			M += 60;
		}
		
		M -= 45;
		if(M<=-1) {
			M = M*-1;
			M = 60 - M;
			H -= 1;
		}
		
		System.out.println(H+" "+M);
		

	}

}
