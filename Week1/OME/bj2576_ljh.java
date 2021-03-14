public class bj2576_ljh {
	public static void main(String[] args) {
		int[] arr = new int[7];
		int min = 100;
		int sum = 0;
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
			
			if(arr[i] % 2 != 0) {
				sum += arr[i];
				
			if(min > arr[i]) 
				min = arr[i];
			}
		}
		if(sum == 0) {
			System.out.println("-1");
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}