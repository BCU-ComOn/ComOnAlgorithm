import java.util.ArrayList;
import java.util.Scanner;

public class bj2747_lwm {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(0);
    numbers.add(1);
    int n = sc.nextInt();

    for (int i = 2; i <= n; i++) {
      int num = numbers.get(i - 1) + numbers.get(i - 2);
      numbers.add(num);
    }
    System.out.println(numbers.get(n));
    sc.close();
  }
}