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
		double countUpper=0;       //need to initialize to double only not int, if u put int, it wont give precision only give integer
		double countLower=0;       //if u put double, when doing division double/int result would be double(more precision)
		double countDigits=0;
		double countSpecial=0;
		for(int i=0;i<ch.length;i++){       // will go to every character and check for ascii vallues of each
			if((int)ch[i]>=(int)'A'&&(int)ch[i]<=(int)'Z'){ //comparing ascii of character and ascii of upper letter(A to Z) 
			countUpper++;                                   //ie 65 to 91(65+26)
			}
			else if((int)ch[i]>=(int)'a'&&(int)ch[i]<=(int)'z'){ //comparing ascii of character and ascii of lower letter(a to z) 
				countLower++;                                    //97 to (97+26)
			}
			else if((int)ch[i]>=(int)'0'&&(int)ch[i]<=(int)'9'){ //comparing ascii of character and ascii of digits character(0 to 9)
				countDigits++;                                   //48 to (48+9)
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
