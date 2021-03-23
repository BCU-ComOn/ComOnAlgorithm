import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int NUM = sc.nextInt();
      
      for(int i = 0; i < NUM; i++) {
         for(int L=1; L<NUM-i; L++) {
            System.out.print(" ");
         }
         for(int I = 0; I < 2*i+1; I++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }

}