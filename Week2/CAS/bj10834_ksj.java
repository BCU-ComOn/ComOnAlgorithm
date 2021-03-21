import java.util.Scanner;

public class bj10824_ksj {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String d = sc.next();

        long ab = Long.parseLong(a + b);
        long cd = Long.parseLong(c + d);

        System.out.println(ab + cd);
    }

}