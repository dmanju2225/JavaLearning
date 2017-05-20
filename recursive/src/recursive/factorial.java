package recursive;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter an Integer");
		int num=scan.nextInt();
		int op=fact(num);
		System.out.println(op);
		scan.close();
	}

	private static int fact(int num) {
		// TODO Auto-generated method stub
		if(num==0||num==1){
		return 1;	
	}
		System.out.println("fact of ("+new Integer(num)+") is calling fact of("+new Integer(num-1)+")");
		int res=num*fact(num-1);
		System.out.println("result of fact("+num+ ") is "+ res);
		return res;
		
}
}