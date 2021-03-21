import java.util.Scanner;

public class bj10797_ksj {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        int[] car = new int[5];
        int count = 0;

        for (int i = 0; i < 5; i++) {
            car[i] = sc.nextInt();
            if (date == car[i]) {
                count++;
            }
        }

        System.out.println(count);
    }

}