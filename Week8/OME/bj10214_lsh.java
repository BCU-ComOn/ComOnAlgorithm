import java.util.Scanner;

public class bj10214_lsh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] y = new int[9];
        int[] k = new int[9];
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int sumY = 0;
            int sumK = 0;
            for (int j = 0; j < 9; j++) {
                y[j] = sc.nextInt();
                sumY += y[j];
                k[j] = sc.nextInt();
                sumK += k[j];
            }
            if (sumY > sumK)
                System.out.println("Yonsei");
            else if (sumY < sumK)
                System.out.println("Korea");
            else
                System.out.println("Draw");
        }

    }
}
