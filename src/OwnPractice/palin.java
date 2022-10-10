package OwnPractice;

import java.util.*;

class palin
{
	public static void main (String [] args)
	{
		System.out.println("\nEnter a value: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		ArrayList<Object> ans = new ArrayList<>();
		for (int i = input.length()-1; i>=0; i--)
		{
			ans.add(input.charAt(i));
		}
		String res = "";
		for (int j=0; j<input.length(); j++)
		{
			res = res.concat(ans.get(j).toString());
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