import java.util.Scanner;

public class bj5565_ksj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int books = 0;
        int price;

        for (int i = 1; i < 10; i++) {
            price = sc.nextInt();
            books += price;
        }
        System.out.print(total - books);
    }

}
