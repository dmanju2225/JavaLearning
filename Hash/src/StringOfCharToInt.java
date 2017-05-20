import java.util.Scanner;


public class StringOfCharToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		String s1=scan.nextLine();
		String result=conversion(s1);
		System.out.println(result);

	}

	private static String conversion(String s1) {
		// TODO Auto-generated method stub
		char[] ch=s1.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(char ch1:ch){                     //iterating over each char in array
			int ascii=(int)ch1;               // giving ascii value of char
			sb.append(ascii);                 //appending each ascii value to string builder
		}
		return sb.toString();                // returning string after for loop breaks
	}

}
