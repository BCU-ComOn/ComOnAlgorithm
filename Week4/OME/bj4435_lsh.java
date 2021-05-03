import java.util.Scanner;

public class bj4435_lsh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] gan = { 1, 2, 3, 3, 4, 10 };
        int[] sa = { 1, 2, 2, 2, 3, 5, 10 };

        for (int i = 0; i < t; i++) {

            int gSum = 0;
            int sSum = 0;

            for (int j = 0; j < gan.length; j++) {
                int num = sc.nextInt();
                gSum += gan[j] * num;
            }

            for (int j = 0; j < sa.length; j++) {
                int num = sc.nextInt();
                sSum += sa[j] * num;
            }
            if (gSum > sSum) {
                System.out.println("Battle " + (i + 1) + ": " + "Good triumphs over Evil");
            } else if (gSum < sSum) {
                System.out.println("Battle " + (i + 1) + ": " + "Evil eradicates all trace of Good");
            } else {
                System.out.println("Battle " + (i + 1) + ": " + "No victor on this battle field");
            }

        }

    }

}
