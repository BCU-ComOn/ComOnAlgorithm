import java.util.Scanner;

public class bj1551_lsh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = scanner.nextInt();
        int[] array = new int[num];
        String[] t = new String[num];
        String str = scanner.next();
        t = str.split(",");
        for (int i = 0; i < array.length; i++)
            array[i] = Integer.parseInt(t[i]);

        for (int time = 0; time < count; time++) {
            for (int i = 0; i < num - 1; i++) {
                array[i] = array[i + 1] - array[i];
            }
        }
        for (int i = 0; i < N - K; i++) {
            System.out.print(A[i]);
            if (i != N - K - 1)
                System.out.print(',');
        }
    }

}