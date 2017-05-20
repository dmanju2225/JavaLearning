package recursive;

import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter an Integer");
		int num=scan.nextInt();
		int op=fib(num);
		System.out.println(op);
		scan.close();
	}

	private static int fib(int num) {
		// TODO Auto-generated method stub
		if(num==0||num==1){
			return num;
		}
		System.out.println("fib(" + new Integer(num) + ") calling fib("+ new Integer(num-1) + ") and fib("+ new Integer(num-2)+")");
		int res=fib(num-1)+fib(num-2);
		System.out.println("result came: fib(" + new Integer(num) + ") calling fib("+ new Integer(num-1) + ") and fib("+ new Integer(num-2)+")");

		return res;
		
	}

}
