import java.util.Scanner;

public class bj10214_jhi_lwm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int i = 0; i < T; i++) {
      int yScore = 0;
      int kScore = 0;
      for (int j = 0; j < 9; j++) {
        yScore += sc.nextInt();
        kScore += sc.nextInt();
      }
      System.out.println(yScore > kScore ? "Yonsei" : "Korea");
    }
    sc.close();
  }
}