import java.util.Scanner;


public class swappWithoutThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two numbers");
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println("before swapping");
		System.out.println("value of x is "+x+" value of y is "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("after swapping");
		System.out.println("value of x is "+x+" value of y is "+y);

	}

}
