import java.util.Scanner;

public class bj8958_jhi_lwm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    for (int i = 0; i < count; i++) {
      String s = sc.next();
      int score = 0;
      int sco = 0;
      for (int j = 0; j < s.length(); j++) {
        if (s.charAt(j) == 'O') {
          sco++;
          score += sco;
        } else {
          sco = 0;
        }
      }
      System.out.println(score);
    }
    sc.close();
  }
}