import java.util.Scanner;

public class bj3058_ksj_lwm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int min = 0;
            int sum = 0;
            int[] arr = new int[7];
            for (int j = 0; j < 7; j++) {
                arr[j] = sc.nextInt();
                if (arr[j] % 2 == 0) {
                    sum += arr[j];
                    if (min == 0) {
                        min = arr[j];
                    }
                    if (arr[j] < min) {
                        min = arr[j];
                    }
                }
            }
            System.out.println(sum + " " + min);
        }
    }

}