import java.util.Scanner;
import java.util.Arrays;

public class bj2576_lwm {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[] array = new int[7];
    int sum = 0;
    int min = 0;

    for (int i = 0; i < array.length; i++) {
      array[i] = sc.nextInt();
      if (array[i] % 2 == 1) {
        sum += array[i];
      }
    }
    Arrays.sort(array);
    for (int j = 0; j < array.length; j++) {
      if (array[j] != 0 && array[j] % 2 == 1) {
        min = array[j];
        break;
      }
    }

    if (sum != 0) {
      System.out.println(sum);
      System.out.println(min);
    } else {
      System.out.println("-1");
    }
    sc.close();
  }
}