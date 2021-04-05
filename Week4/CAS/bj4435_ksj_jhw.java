import java.util.Scanner;

public class bj4435_ksj {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] G = { 1, 2, 3, 3, 4, 10 };
        int[] S = { 1, 2, 2, 2, 3, 5, 10 };

        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        for (int i = 0; i < cnt; i++) {
            int sumG = 0;
            int sumS = 0;

            for (int j = 0; j < G.length; j++) {
                int numG = sc.nextInt();
                sumG += numG * G[j];
            }
            for (int j = 0; j < S.length; j++) {
                int numS = sc.nextInt();
                sumS += numS * S[j];
            }
            if (sumG > sumS) {
                System.out.println("Battle " + (i + 1) + ": Good triumphs over Evil");
            } else if (sumG < sumS) {
                System.out.println("Battle " + (i + 1) + ": Evil eradicates all trace of Good");
            } else {
                System.out.println("Battle " + (i + 1) + ": No victor on this battle field");
            }
        }

    }

}
