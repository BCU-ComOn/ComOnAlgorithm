import java.util.Scanner;

public class bj2442_lsh {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            for (int j = i; j < num - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}