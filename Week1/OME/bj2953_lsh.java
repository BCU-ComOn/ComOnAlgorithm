import java.util.Scanner;

public class bj2953_lsh {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] num = new int[5][4];
        int[] sum = new int[5];

        int max = 0;
        int index = 0;

        for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = sc.nextInt();
                sum[i] += num[i][j];

            }
            if (sum[i] > max) {
                max = sum[i];
            }
            if (sum[i] == max) {
                index = i + 1;
            }

        }
        System.out.println(index + " " + max);
    }
}
