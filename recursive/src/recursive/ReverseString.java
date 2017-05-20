package recursive;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str1=scan.nextLine();
		//String result=reverseStr(str1);
		//System.out.println(result);
		//String result2=reverseStr2(str1);
		//System.out.println(result2);
		//String result3=reverseStr3(str1);
		//System.out.println(result3);
		String result4=reverseStr4(str1);
		System.out.println(result4);
		

	}

	private static String reverseStr4(String str1) {                    //using recursion
		// TODO Auto-generated method stub
		if(str1==null||str1.length()<=1){   //if u dont include this step u will get string index out of bound exception(checking for empty string and single char string
			return str1;
		}
		String revString=reverseStr4(str1.substring(1))+str1.charAt(0);    //for ex: abcd string,for first cycle bcd+a, now bcd input cd+b+a, cd input o/p d+b+c+a,
		                                                                   // for input d no substring then it will go to return step
		return revString;
	}

	private static String reverseStr3(String str1) {
		// TODO Auto-generated method stub
		int begin=0;
		int end=str1.length()-1;
		char[] ch=str1.toCharArray();
		while(end>begin){
		 char temp =ch[begin];
		      ch[begin]=ch[end];
		      ch[end]=temp;
		      begin++;
		      end--;
		}
		return new String(ch);
		
	}

	private static String reverseStr2(String str1) {
		// TODO Auto-generated method stub
		String revString="";
		for(int i=str1.length()-1;i>=0;i--){
			revString=revString+str1.charAt(i);
		}	
		return revString;
		
	
	}

	private static String reverseStr(String str1) {
		// TODO Auto-generated method stub
		char[] str2=str1.toCharArray();
		int n=str2.length;
		String revString="";
		for(int i=str1.length()-1;i>=0;i--){
			revString=revString+str2[i];
		}	
		return revString;
	}
	//program using recursion

}
