package stringEasyProblems;

import java.util.Scanner;

public class ValidPalindromeII
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string ");
		String s = scan.nextLine();
		boolean bl = validPalindromeII(s);
		System.out.println(bl);
	}

	private static boolean validPalindromeII(String s)
	{
		// TODO Auto-generated method stub
		char[] ch = s.toCharArray();
		char temp;
		int count = 0;
		int begin = 0;
		int end = s.length() - 1;
		while (end > begin)
		{
			if (ch[begin] != ch[end])
			{
				count++;
				temp = ch[begin];
				ch[begin] = ' ';
				String s1 = new String(ch).trim().replace(" ", "");
				String s2 = new StringBuilder(s1).reverse().toString();
				if (s1.equals(s2))
				{
					return true;
				}
				ch[begin] = temp;
				temp = ch[end];
				ch[end] = ' ';
				String s3 = new String(ch).trim().replace(" ", "");
				String s4 = new StringBuilder(s3).reverse().toString();
				if (s3.equals(s4))
				{
					return true;
				}
				ch[end] = temp;
			}
			begin++;
			end--;
		}
		if (count == 0)
		{
			return true;
		}
		return false;
	}
}