import java.util.Scanner;

public class bj2576_lmy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[7];
        int sum = 0;
        int cnt= 0;
        for(int i=0;i<num.length;i++)
        {
        	num[i] = sc.nextInt();
        	if(num[i] % 2 == 1) {
        		num[i] = num[i];
        		sum += num[i];
        		cnt++;
        	}
        	else
        		num[i] = 101;
        	
        }
        sc.close();
        Arrays.sort(num);
        if(cnt>0) {
        	System.out.println(sum);
        	System.out.println(num[0]);
        }
        else
        	System.out.println("-1");
    }
}