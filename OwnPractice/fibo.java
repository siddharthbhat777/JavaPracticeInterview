import java.util.*;

class fibo
{
	public static void main (String [] args)
	{
		int i = 1;
		int j=0;
		System.out.println("Enter range:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("\nFibonacci numbers: ");
		for (int x=0; x<n; x++)
		{
			int k = i + j;
			System.out.println(k);
			i=j;
			j=k;
		}	
	}
}