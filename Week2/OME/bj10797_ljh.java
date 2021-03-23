import java.util.Scanner;

public class bj10797_ljh {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int date = in.nextInt();
		
		for(int i = 0; i < 5; i++) {
			int car_num = in.nextInt();
		if(car_num == date) {
			sum += 1;
			}
		}
		System.out.println(sum);
	}
}