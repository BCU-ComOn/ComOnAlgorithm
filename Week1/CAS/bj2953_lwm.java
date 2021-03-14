import java.util.Scanner;

public class bj2953_lwm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[][] score = new int[5][4];
    int[] sum = new int[5];
    int max = 0;
    int index = 0;

    for (int i = 0; i < score.length; i++) {
      for (int j = 0; j < score[i].length; j++) {
        int value = sc.nextInt();
        score[i][j] = value;
        sum[i] += score[i][j];
      }
    }

    for (int k = 0; k < score.length; k++) {
      if (max < sum[k]) {
        max = sum[k];
        index = k;
      }
    }
    sc.close();

    System.out.println(index + 1 + " " + max);
  }
}