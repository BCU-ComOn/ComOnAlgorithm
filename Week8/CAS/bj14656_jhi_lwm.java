import java.util.Scanner;

public class bj14656_jhi_lwm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int count = 0;

    for (int i = 0; i < number; i++) {
      int student = sc.nextInt();
      if (student == (i + 1))
        continue;
      count++;
    }
    System.out.println(count);

    sc.close();
  }
}