import java.util.Scanner;


public class stringReverseWithConstantWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=scan.nextLine();
		fixedWhiteSpaces(s1);

	}

	private static void fixedWhiteSpaces(String s1) {
		// TODO Auto-generated method stub
		char[] ch=s1.toCharArray();
		int startIndex=0;             //position of characters
		int endIndex=s1.length()-1;   
		while(startIndex<endIndex){
			if(ch[startIndex]==' '){ //if there is space at start position it will do nothing and jump to next position
				startIndex++;        // and continue the while loop with new positions
				continue;
			}
			if(ch[endIndex]==' '){  //if there is space at end position it will do nothing and move back to before position
				endIndex--;         // and continue the while loop with new positions
				continue;
			}
			char temp=ch[startIndex];     //swapping the characters
			ch[startIndex]=ch[endIndex];
			ch[endIndex]=temp;
			startIndex++;                 //position increments by 1 after swapping
			endIndex--;	
		}
		System.out.println(ch);         //if start<end , loop breaks and print end charater array
		
	}

}
