import java.util.Scanner;

public class bj2884_ksj {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if (minute >= 45) {
            System.out.printf("%d %d", hour, minute - 45);
        }

        else if (minute < 45) {
            if (hour - 1 < 0) {
                hour = 23;
            } else {
                hour -= 1;
            }
            System.out.printf("%d %d", hour, minute + 15);
        }
    }
}