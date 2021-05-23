import java.util.Scanner;
import java.util.Arrays;

public class Bj10820_ksj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            int num = 0;
            int lower = 0;
            int upper = 0;
            int blank = 0;

            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    lower++;
                } else if (ch >= 'A' && ch <= 'Z') {
                    upper++;
                } else if (ch >= '0' && ch <= '9') {
                    num++;
                } else if (ch == ' ') {
                    blank++;
                }
            }
            System.out.println(lower + " " + upper + " " + num + " " + blank);
        }
    }
}