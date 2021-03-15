import java.util.Scanner;

public class bj5565_lwm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int totalPrice = sc.nextInt();
    int knownPrice = 0;

    for (int i = 0; i < 9; i++) {
      int num = sc.nextInt();
      knownPrice += num;
    }
    sc.close();

    System.out.println(totalPrice - knownPrice);
  }
}