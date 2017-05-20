package recursive;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		int res=reverse(n);
		System.out.println(res);

	}

	private static int reverse(int n) {
		// TODO Auto-generated method stub
		int revNumber=0;
		while(n>0){
			int number=n%10;
			revNumber=revNumber*10+number;
			n=n/10;
			
			
		}
		return revNumber;
	}

}
