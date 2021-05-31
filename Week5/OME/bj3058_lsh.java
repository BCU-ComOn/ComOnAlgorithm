package 알고리즘;

import java.util.Scanner;

public class bj3058 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] array = new int[7];

        for (int i = 0; i < count; i++) {
            int sum = 0;
            int min = 101;
            for (int j = 0; j < 7; j++) {
                array[j] = in.nextInt();

                if ((array[j] % 2) == 0) {
                    sum += array[j];
                    if (array[j] < min) {
                        min = array[j];
                    }
                }
            }
            System.out.println(sum + " " + min);
        }
    }

}
