import java.util.*;

class prime
{
	public static void main(String [] args)
	{
		System.out.println("\nEnter a number:");
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		boolean prime = true;
		for (long i = 2; i<n; i++)
		{
			if((n%i) == 0)
			{
				prime = false;
				break;
			}
		}
		if(prime)
		{
			System.out.println("\nNumber " + n + " is Prime");
		}
		else
		{
			System.out.println("Number " + n + " is not Prime");
		}
	}
}