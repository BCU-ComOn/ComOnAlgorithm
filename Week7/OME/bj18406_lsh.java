import java.util.Scanner;

public class bj18406_ksj {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String num = sc.next();// 123456
        String str1 = num.substring(0, num.length() / 2);// 123
        String str2 = num.substring(num.length() / 2);// 456

        String strArr1[] = str1.split("");
        String strArr2[] = str2.split("");
        int strSum1 = 0;
        int strSum2 = 0;
        for (int i = 0; i < strArr1.length; i++) {
            strSum1 += Integer.parseInt(strArr1[i]);
            strSum2 += Integer.parseInt(strArr2[i]);
        }
        if (strSum1 == strSum2) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }

    }
}
