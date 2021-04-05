import java.util.Arrays;
import java.util.Scanner;

public class bj2750_ksj {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        Arrays.sort(arr);
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

    }

}
