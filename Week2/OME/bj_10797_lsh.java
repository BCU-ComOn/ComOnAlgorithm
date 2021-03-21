import java.util.Scanner;

public class bj_10797_lsh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int car = sc.nextInt();
            if (date == car) {
                sum++;
            }
        }
        System.out.print(sum);
    }

}
