import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class sumOfPairEqualToNumberUsinghashSet {

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
//		ArrayList<Integer> al=new ArrayList<Integer>();
//		for(int i =0 ;i < n ;i++)
//			al.add(a[i]);
//		
//		
//		HashSet<Integer> hs1 = new HashSet<Integer>();
//		hs1.addAll(al);
//		ArrayList<Integer> al_result=new ArrayList<Integer>();
//		al_result.addAll(hs1);
//		
		
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (int i = 0; i < n; i++) {
				hs.add(a[i]);
		}
		HashSet<Integer> hs2 = new HashSet<Integer>();
		
		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			Integer itr = (Integer) it.next();
			
			if (hs2.contains(x - itr)) {
				System.out.println(itr + "" + (x - itr));
			}
			else
				hs2.add(itr);
				
		}
	}

}
