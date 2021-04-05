import java.util.Scanner;

public class bj10872_jhi_lwm {
  int factorial(int num) {
    int result = 0;
    if (num == 0) {
      return 1;
    } else {
      result += num * factorial(num - 1);
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main m = new Main();

    int n = sc.nextInt();
    System.out.println(m.factorial(n));
    sc.close();
  }
}