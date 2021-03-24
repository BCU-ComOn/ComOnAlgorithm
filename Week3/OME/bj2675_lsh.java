import java.util.Scanner;

public class bj2675_lsh {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {

            int R = sc.nextInt();
            String S = sc.next();

            for (int j = 0; j < S.length(); j++) {

                for (int K = 0; K < R; K++) {

                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }

    }

}
