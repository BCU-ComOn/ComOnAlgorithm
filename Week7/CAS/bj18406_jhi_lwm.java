import java.util.Scanner;

public class bj18406_jhi_lwm {

  int change(String str) {
    int sum = 0;
    for (int i = 0; i < str.length(); i++) {
      sum += Character.getNumericValue((str.charAt(i)));
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str = s.next();
    bj18406_jhi_lwm m = new bj18406_jhi_lwm();

    String str1 = str.substring(0, str.length() / 2);
    str = str.substring(str.length() / 2);

    if (m.change(str1) == m.change(str)) {
      System.out.println("LUCKY");
    } else {
      System.out.println("READY");
    }
  }
}