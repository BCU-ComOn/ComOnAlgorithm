import java.util.Scanner;
import java.util.ArrayList;

public class bj1551_ksj_lwm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    String[] A = new String[N];
    A = sc.next().split(",");
    ArrayList<Integer> B = new ArrayList<Integer>();

    for (int i = 0; i < A.length; i++) {
      B.add(Integer.parseInt(A[i]));
    }

    for (int j = 0; j < K; j++) {
      for (int k = 0; k < B.size() - 1; k++) {
        B.set(k, B.get(k + 1) - B.get(k));
      }
      B.remove(B.size() - 1);
    }

    for (int l = 0; l < B.size(); l++) {
      if (l < B.size() - 1) {
        System.out.print(B.get(l) + ",");
      } else {
        System.out.print(B.get(l));
      }
    }
    sc.close();
  }
}