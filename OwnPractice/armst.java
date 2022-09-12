import java.lang.*;

class armst
{
	public static void main (String [] args)
	{
		long n = 1741725;
		double res=0;
		long tmp2=n;
		long power = String.valueOf(n).length();
		
		while (tmp2>0)
		{
			double tmp = Math.pow((tmp2%10), power);
			res = res + tmp;
			tmp2 = tmp2/10;
		}
		if(n == res)
		{
			System.out.println(n + " is an armstrong number");
		}
		else
		{
			System.out.println(n + " is not an armstrong number");
		}
	}
}