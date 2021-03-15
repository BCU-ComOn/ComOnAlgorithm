import java.util.Scanner;

public class bj5565_lsh {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            price -= sc.nextInt();
        }
        System.out.println(price);
    }
}
