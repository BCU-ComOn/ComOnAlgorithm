import java.util.Scanner;

public class bj2747_ksj {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 0 || num == 1) {
            System.out.println(num);
        } else {
            int[] arr = new int[num];
            arr[0] = 0;
            arr[1] = 1;
            for (int i = 2; i < num; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            System.out.println(arr[num - 1] + arr[num - 2]);
        }
    }

}