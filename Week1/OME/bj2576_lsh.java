import java.util.Scanner;

public class bj2576_lsh {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];
        int sum = 0;
        int min = 100;

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

            if (array[i] % 2 != 0) {
                sum += array[i];

                if (min > array[i]) {
                    min = array[i];
                }
            }
        }

        if (sum == 0) {
            System.out.print(-1);
        } else {
            System.out.println(sum);
            System.out.print(min);
        }
    }
}
