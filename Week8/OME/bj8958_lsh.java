import java.util.Scanner;

public class bj8958_lsh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int score = 0;
        int sum = 0;
        String str;

        for (int i = 0; i < num; i++) {
            str = sc.next();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    score++;
                    sum += score;
                } else
                    score = 0;
            }
        }
        System.out.println(sum);
    }

}
