import java.util.Scanner;

public class bj29295_ksj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        for (int i = 0; i < len; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int sum = num1 + num2;

            System.out.println("Case " + (i + 1) + ": " + sum);
        }
    }

}
