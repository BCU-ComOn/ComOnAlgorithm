import java.util.Scanner;

public class bj2163_lwm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();

    System.out.println(N * M - 1);
    sc.close();
  }
}