package OwnPractice;

import java.util.*;

class swapnotemp
{
	public static void main(String [] args)
	{
		System.out.println("Enter numbers:");
		Scanner sc = new Scanner(System.in);
		long x = sc.nextInt();
		long y = sc.nextInt();
		System.out.println("\nOriginal values:");
		System.out.println(x + " and " + y);
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("\nSwapped values:");
		System.out.println(x + " and " + y);
	}
}