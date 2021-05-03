import java.util.Scanner;

public class bj10872_lsh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 1;

        if (n != 0) {
            for (int i = n; i > 0; i--) {
                s *= i;
            }
            System.out.print(s);

        } else {
            System.out.print(s);
        }

    }

}
