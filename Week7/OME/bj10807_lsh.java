import java.util.Scanner;

public class bj10807_lsh {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] array = new int[count];
        int sum = 0;
        for (int i = 0; i < count; i++) {
            array[i] = in.nextInt();
        }
        int find = in.nextInt();
        for (int j = 0; j < array.length; j++) {
            if (find == array[j]) {
                sum++;
            }
        }
        System.out.print(sum);

    }

}
