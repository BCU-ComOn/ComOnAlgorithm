import java.util.Scanner;

public class bj9295_lsh {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        for (int i = 0; i < count; i++) {
            int l = in.nextInt();
            int r = in.nextInt();
            System.out.println("Case " + (i + 1) + ": " + (l + r));
        }

    }

}
