import java.util.Scanner;
public class bj_2747_lsh {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int ex0 = 0;
		int ex1 = 1;
		
		for(int i = 0; i <= num; i++) {
			if(i == 0) {
				sum = ex0;
			} else if(i == 1){
				sum = ex1;
			} else {
				sum = ex0 + ex1;
				ex0 = ex1;
				ex1 = sum;
			}
		}
		System.out.println(sum);
	}
}
