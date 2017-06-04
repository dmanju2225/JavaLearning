import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class removeCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=scan.nextLine();
		System.out.println("enter a character");
	    char ch=scan.next().charAt(0);
		char[] cr=s1.toCharArray();
		ArrayList<Character> result=removechar(cr,ch);
		String sr=result.toString().replace("[","").replace(", ","").replace("]","");//convert arralist to string and 
		                                                                             //perform reg expression to print as a string
		
		System.out.println(sr);

	}

	private static ArrayList<Character> removechar(char[] cr,char ch) {
		// TODO Auto-generated method stub
		ArrayList<Character> al=new ArrayList<Character>();//creating empty arraylist
		for(int i=0;i<cr.length;i++){//iterating over character array
			if(cr[i]!=ch){//checking each character, if it not input character then only add to arraylist of characters
				al.add(cr[i]);	
			}
		}
		return al;
		
	}

}
