import java.util.Scanner;

public class Main{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String a = sc.next();
       String b = sc.next();
       String ab = a+b;
       
       String c = sc.next();
       String d = sc.next();
       String cd = c+d;
     
       //int Fir = Integer.parseInt(ab);
       //int Sec = Integer.parseInt(cd);
       long result = Long.parseLong(ab)+Long.parseLong(cd);
       //long ans = Long.valueOf(ab)+Long.valueOf(cd);
       //Long.parseLong(ab)+Long.parseLong(cd);
       System.out.println(result);
   }
}