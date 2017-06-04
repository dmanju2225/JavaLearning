import java.util.Arrays;
import java.util.Scanner;


public class sumOfPairDoingOtherWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter an integer");
		int n = scan.nextInt();
		System.out.println("enter the expecting sum");
		int x = scan.nextInt();
		System.out.println("enter an array of elemrnts");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		findingPairs(a, n, x);
	}

	private static void findingPairs(int[] a, int n, int x) {
		// TODO Auto-generated method stub
		
		
	}

}
