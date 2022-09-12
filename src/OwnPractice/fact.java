package OwnPractice;

import java.util.*;

class fact
{
	public static void main(String [] args)
	{
		System.out.println("\nEnter your number:");
		Scanner sc = new Scanner(System.in);
		long inp = sc.nextInt();
		long tmp = 1;
		for (long i = inp; i > 0; i--)
		{
			tmp = tmp * i;
		}
		System.out.println("\nFactorial of number: " + tmp);
	}
}