package BJ_Algorithm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_10824_JHI {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = bf.readLine().split(" ");
		String first = null;
		String last = null;
		long result = 0L;
		
		for(int i = 0; i < 4; i++) {
			if(i%2==0) {
				first = strs[i];
			} else {
				last = strs[i];
				String number = first + last;
				result += Long.parseLong(number);
			}
		}
		System.out.println(result);
	}
}