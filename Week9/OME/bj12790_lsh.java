import java.util.Scanner;
import java.util.Arrays;

public class bj12790_lsh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        for (int i = 0; i < len; i++) {
            int[] arr = new int[8];

            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }

            int hp = (arr[0] + arr[4]);
            int mp = (arr[1] + arr[5]);
            int attack = (arr[2] + arr[6]);
            int defense = (arr[3] + arr[7]);

            hp = (hp < 1) ? 1 : hp;
            mp = (mp < 1) ? 1 : mp;
            attack = (attack < 0) ? 0 : attack;

            System.out.println(hp + 5 * mp + 2 * attack + 2 * defense);

        }
    }
}