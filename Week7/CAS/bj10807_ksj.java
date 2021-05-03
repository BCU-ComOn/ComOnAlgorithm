import java.util.Scanner;

public class bj10807_ksj {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 0;
        int arr[] = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // 크기 : 5, 2 2 3 1 2
        }
        // arr[] = {2,2,3,1,2};
        int findNum = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (findNum == arr[i]) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }

}
