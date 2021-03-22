import java.util.Scanner;

public class bj10797_lmy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int date = scan.nextInt();
		int[] car = new int[5];
		int vioCar = 0;
		for(int i=0; i<car.length; i++) {
			car[i] = scan.nextInt();
			if(car[i] == date)
				vioCar ++;
		}
		System.out.println(vioCar);
		scan.close();
	}

}