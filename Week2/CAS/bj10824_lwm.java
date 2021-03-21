import java.util.Scanner;

public class bj10824_lwm {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s1 = "";
    String s2 = "";
    long sum = 0;

    for (int i = 0; i < 4; i++) {
      String n = sc.next();
      if (i < 2) {
        s1 += n;
      } else {
        s2 += n;
      }
    }

    sum = Long.parseLong(s1) + Long.parseLong(s2);

    System.out.println(sum);
    sc.close();
  }
}