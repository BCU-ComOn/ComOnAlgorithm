import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(Function(N));
	}
	public static int Function(int num) {
		if(num==1) {
			return 1;
		} else if(num==0){
			return 1;
		}else{
			return num*Function(num-1);
		}
	}
}