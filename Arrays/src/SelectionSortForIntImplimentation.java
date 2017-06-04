import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SelectionSortForIntImplimentation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number of integers");
		int n = scan.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			al.add(scan.nextInt());
		}
		selectionSort(al);
	}
	private static void selectionSort(ArrayList<Integer> al) {
		int n = al.size();                                                       // int max_index=0
		while (n > 1) {                                                         // int max = Integer.MIN_VALUE;
			int max_index = 0;                                                   // max = al.get(i);
			for (int i = 0; i < n; i++) {
				if (al.get(i) > al.get(max_index)) {
					max_index = i;
				}
			}
			Collections.swap(al, n - 1, max_index);
			n = n - 1;
		}
		System.out.println(al);
	}
}



// if(al.get(n-1)==max){
// n=n-1;
// continue;
// }
// int k=al.get(max_index);
// int x=al.get(n-1);
// al.set(n-1,al.get(max_index));
// al.set(max_index,x);
