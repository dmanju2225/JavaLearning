import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class duplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = scan.nextInt();
		int[] a = new int[n];
		System.out.println("enter the array elements");
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		findingDuplicate(a, n);

	}

	private static void findingDuplicate(int[] a, int n) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (hm.containsKey(a[i])) {
				int count = hm.get(a[i]);
				hm.put(a[i], count + 1);
			} else {
				hm.put(a[i], 1);
			}
		}
		Set<Integer> set = hm.keySet();
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer ir = (Integer) it.next();
			if (hm.get(ir) > 1) {
				System.out.println("duplicate elements are " + ir);
			}
		}

	}
}
