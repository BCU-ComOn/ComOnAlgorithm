import java.util.Scanner;

public class bj2441_ksj {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = len; j > i; j--) {
                System.out.print("*");
            }

            System.out.println("");
        }

    }

}