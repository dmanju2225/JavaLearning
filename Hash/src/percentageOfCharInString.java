import java.util.Scanner;


public class percentageOfCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=scan.nextLine();
		percentageOfChar(s1);
		

	}

	private static void percentageOfChar(String s1) {
		// TODO Auto-generated method stub
		char[] ch=s1.toCharArray();
		double countUpper=0;
		double countLower=0;
		double countDigits=0;
		double countSpecial=0;
		for(int i=0;i<ch.length;i++){
			if((int)ch[i]>=(int)'A'&&(int)ch[i]<=(int)'Z'){
				countUpper++;
			}
			else if((int)ch[i]>=(int)'a'&&(int)ch[i]<=(int)'z'){
				countLower++;
			}
			else if((int)ch[i]>=(int)'0'&&(int)ch[i]<=(int)'9'){
				countDigits++;
			}
			else{
				countSpecial++;
			}
		}
		
		double percentageUpper=(countUpper/ch.length)*100;
		double percentageLower=(countLower/ch.length)*100;
		double percentageDigits=(countDigits/ch.length)*100;
		double percentageSpecial=(countSpecial/ch.length)*100;
		System.out.println(percentageUpper);
        System.out.println(percentageLower);
		System.out.println(percentageDigits);
		System.out.println(percentageSpecial);
		
	}

}
