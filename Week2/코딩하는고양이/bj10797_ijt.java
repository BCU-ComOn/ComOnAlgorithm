import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int Day;
		int Car;
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		Day = sc.nextInt();
		
		for(int i=0; i<5;i++) {
			Car = sc.nextInt();
			if(Car==Day) {
				result += 1;}
		}
		System.out.println(result);

	}

}
