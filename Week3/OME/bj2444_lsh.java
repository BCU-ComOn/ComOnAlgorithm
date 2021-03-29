import java.util.Scanner;

public class bj2444_lsh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            // 공백 만들기
            for (int j = i; j < num - 1; j++) {
                System.out.print(" ");
            }
            // 별 만들기
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        // i=3,2,1
        for (int i = num - 1; i > 0; i--) {
            // 공백 만들기
            for (int j = i; j < num; j++) {// 0,1,2,3,
                System.out.print(" ");
            }
            // 별 만들기
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
