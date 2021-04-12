package com_on;
// 수열의 변화
import java.util.*;

public class bj1551_cjy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int K = s.nextInt();
		String st = s.next();
		
		String[] str= new String[N];
		str = st.split(",");
		int [] A = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
		
		if(K==0) {
			for(int i=0; i<N; i++)
				if(i==N-1)
					System.out.print(A[i]);
				else
					System.out.print(A[i]+",");	
		
		}
		else {
			for(int i=0; i < K; i++) {
				for(int j=0; j<N-i-1; j++)
					A[j] = A[j+1] - A[j];
			}
			
			for(int i=0; i<N-K; i++)
				if(i==N-K-1)
					System.out.print(A[i]);
				else
					System.out.print(A[i]+",");	
		}
	}
}
