import java.util.Scanner;

public class bj2576_ksj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[7];
        int sum = 0;
        int min = 100;

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();

            if (num[i] % 2 == 1) {
                sum += num[i];

                if (min > num[i])
                    min = num[i];
            }
        }

        if (sum == 0) { // 홀수가 없을때 (홀수의 합 0)
            System.out.print("-1");
        } else {
            System.out.print(sum + "\n");
            System.out.print(min);
        }
    }
}
