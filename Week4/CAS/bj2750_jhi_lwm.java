import java.util.Scanner;
import java.util.Arrays;

public class bj2750_jhi_lwm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    int[] array = new int[count];

    for (int i = 0; i < count; i++) {
      array[i] = sc.nextInt();
    }

    Arrays.sort(array);

    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
    sc.close();
  }
}