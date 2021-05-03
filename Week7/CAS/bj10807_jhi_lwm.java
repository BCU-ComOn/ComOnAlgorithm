import java.util.Scanner;

public class bj10807_jhi_lwm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }
    int find = sc.nextInt();
    int count = 0;
    for (int i = 0; i < N; i++) {
      if (find == arr[i]) {
        count++;
      }
    }
    System.out.println(count);
  }
}