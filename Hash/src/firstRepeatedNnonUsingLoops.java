import java.util.Scanner;

public class firstRepeatedNnonUsingLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String s1 = scan.nextLine();
		char[] ch = s1.toCharArray();
		firstRpeated(ch);
		firstNonRepeated(ch);
	}

	private static void firstRpeated(char[] ch) {
		// TODO Auto-generated method stub

		for (int i = 0; i < ch.length; i++) {
			int flag = 0;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println("first repeated character is " + ch[i]);
					flag = 1;
					break;
				}
			}
			if (flag == 1) {
				break;
			}

		}

	}

	private static void firstNonRepeated(char[] ch) {
		
		for (int i = 0; i < ch.length; i++) {
			int flag=0;
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]&&(i!=j)) {
					flag=1;
					break;
				}
			}
				if(flag==0){
					System.out.println("first non repeated character is "+ch[i]);
					break;
					
				}
				
		}
	}
}


