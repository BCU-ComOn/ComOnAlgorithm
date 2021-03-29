import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int value = scan.nextInt();
		
		int space = value - 1;
		
		for (int i = 1; i <= 2*value-1; i++)
		{
			for (int j = 0; j < space; j++)
				System.out.print(" ");
			
			if( i < value)
			{
				for(int star = 1; star <= 2*i-1; star++)
					System.out.print("*");
				
				if( i < value)
					space -= 1;
			}
			else
			{
				int limit = 2*((2*value)-i)-1;
				for(int star = 1; star <= limit; star++)
					System.out.print("*");
				space += 1;
			}
			System.out.println("");
		
	}


	}}