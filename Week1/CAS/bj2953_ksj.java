import java.util.Scanner;

public class bj2953_ksj {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score[][] = new int[5][4];
        int total[] = new int[5];
        int max = 0;
        int num = 0;

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                score[i][j] = sc.nextInt();
                total[i] += score[i][j];
            }

            if (max < total[i]) {
                max = total[i];
            } // 우승자 점수

            if (max == total[i]) {
                num = i + 1;
            } // 우승자 번호
        }
        System.out.print(num + " " + max);

    }

}