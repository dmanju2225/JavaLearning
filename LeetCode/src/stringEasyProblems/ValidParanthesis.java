package stringEasyProblems;

import java.util.Scanner;

public class ValidParanthesis
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string of (){}[] ");
		String s = scan.nextLine();
		boolean result=validParanthesis(s);
		System.out.println(result);
	}

	private static boolean validParanthesis(String s)
	{
		// TODO Auto-generated method stub
		 int len=s.length();
		 char start=s.charAt(0);
	        char end=s.charAt(len-1);
	        if(len==0||len>1&&len%2==1){
	            return false;
	        } 
	        else if(start==')'||start=='}'||start==']'||end=='('||end=='{'||end=='['){
	        	return false;
	        }
		return true;
	}

}
