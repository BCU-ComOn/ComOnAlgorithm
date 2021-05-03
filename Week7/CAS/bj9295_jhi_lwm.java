import java.util.Scanner;

public class bj9295_jhi_lwm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    int[] arr = new int[T];
    for (int i = 0; i < T; i++) {
      int first = sc.nextInt();
      int second = sc.nextInt();
      arr[i] = first + second;
    }
    for (int i = 1; i <= T; i++) {
      System.out.println("Case " + i + ": " + arr[i - 1]);
    }
    sc.close();
  }
}