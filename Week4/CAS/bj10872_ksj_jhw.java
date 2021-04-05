import java.util.Scanner;

public class bj10872_ksj {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int mul = 1;

        for (int i = num; i > 1; i--) {
            mul *= i;
        }
        System.out.println(mul);

    }

}
