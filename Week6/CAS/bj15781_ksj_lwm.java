import java.util.Scanner;

public class bj15781_ksj_lwm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int j = sc.nextInt();
    int[] hArr = new int[h];
    int[] jArr = new int[j];
    int max = 0;

    for (int i = 0; i < h; i++) {
      hArr[i] = sc.nextInt();
      if (max < hArr[i]) {
        max = hArr[i];
      }
    }
    h = max;
    max = 0;
    for (int k = 0; k < j; k++) {
      jArr[k] = sc.nextInt();
      if (max < jArr[k]) {
        max = jArr[k];
      }
    }
    System.out.println(max + h);
  }
}