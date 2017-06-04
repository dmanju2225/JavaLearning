import java.util.Scanner;


public class removeCharfromString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=scan.nextLine();
		System.out.println("enter a character");
		char ch=scan.next().charAt(0);
		String result=removeChar(s1,ch);
		System.out.println(result);

	}

	private static String removeChar(String s1, char ch) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		char[] ch1=s1.toCharArray();
		for(int i=0;i<ch1.length;i++){
			if(ch1[i]!=ch){
				sb.append(ch1[i]);
				
			}
		}
		return sb.toString();

	}

}
