import java.util.Scanner;

public class bj14656_lsh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        int count = 0;

        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != i + 1) {
                count++;
            }
        }
        System.out.print(count);

    }
}
