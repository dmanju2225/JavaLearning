import java.util.Scanner;


public class removeWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=scan.nextLine();
		//removeSpace(s1); //this method using replaceall method
		removeSpaces(s1);  //without replaceall
	}

	private static void removeSpaces(String s1) {
		// TODO Auto-generated method stub
		char[] ch=s1.toCharArray();
		StringBuffer sb=new StringBuffer();//to build new string
		for(int i=0;i<s1.length();i++){
			if(ch[i]!=' '&&ch[i]!='\t'){ //if character is not space and not tab then char will append to new string
				sb.append(ch[i]);
			}
		}
		System.out.println(sb);
		
	}

	private static void removeSpace(String s1) {
		// TODO Auto-generated method stub
		String result=s1.replaceAll("\\s",""); //replacing all spaces with empty string, \s means space
		System.out.println(result);
		
	}

}
