package com_on;
// 개수 세기
import java.util.Scanner;

public class bj10807_cjy {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int Key = in.nextInt();
      int num = 0;
      int []arr = new int[300];
      
      for(int i = 0 ; i < Key; i++) {
         arr[i] = in.nextInt();
      }
      int V = in.nextInt();
      for(int i = 0 ; i < Key ; i++) {
         if ( arr[i] == V) {
            num ++;
         }
      }
      System.out.println(num);
   }
}
