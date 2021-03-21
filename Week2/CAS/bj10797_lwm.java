import java.util.Scanner;

public class bj10797_lwm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    int day = sc.nextInt();

    for (int i = 0; i < 5; i++) {
      int carNumber = sc.nextInt();
      if (carNumber == day) {
        count++;
      }
    }
    sc.close();
    System.out.println(count);
  }
}