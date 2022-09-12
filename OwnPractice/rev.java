import java.util.*;

class rev
{
	public static void main(String [] args)
	{
		System.out.println("\nEnter number:");
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		//long zeroes = digPlace(n); // another way
		long len = String.valueOf(n).length();
		long i = 0;
		long tmp = n;
		long a;
		long res=0;
		//long z = zeroes; // another way
		while(i<len)
		{
			a = tmp%10;
			//res = res+a*z; //another way
			res = res*10+a; // main way
			//z = z/10; //another way
			tmp = tmp/10;
			i++;
		}
		System.out.println("\nReversed number: " + res);
	}

	/* another way
	public static long digPlace(long x)
	{
		String d = "1";
		String zero = "0";
		String tmp = zero;
		long i=0;
		long len = String.valueOf(x).length();
		while(i < len-2)
		{
			tmp = tmp + zero;
			i++;
		}
		String ans = d.concat(tmp);
		long num = Long.parseLong(ans);
		return num;
	}*/
}