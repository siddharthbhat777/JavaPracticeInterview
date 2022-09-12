package OwnPractice;

import java.util.*;

class palin
{
	public static void main (String [] args)
	{
		System.out.println("\nEnter a value: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String inp = input;
		ArrayList arr = new ArrayList<>();
		for (int i = 0; i< inp.length(); i++)
		{
			arr.add(inp.charAt(i));
		}
		ArrayList ans = new ArrayList<>();
		for (int j = inp.length()-1; j>=0; j--)
		{
			ans.add(arr.get(j));
		}
		String res = "";
		for (int k=0; k<inp.length(); k++)
		{
			res = res.concat(ans.get(k).toString());
		}
		if (input.equals(res))
		{
			System.out.println("\nThe value is palindrome");
		}
		else
		{
			System.out.println("\nThe value is not palindrome");
		}
	}
}