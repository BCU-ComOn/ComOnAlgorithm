import java.util.Scanner;

public class bj_10824_lsh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String C = sc.next();
        String D = sc.next();

        long sum1 = Long.parseLong(A + B);
        long sum2 = Long.parseLong(C + D);

        System.out.println(sum1 + sum2);
    }
}
