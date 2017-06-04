import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InsertionSortForIntImplimentation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter no of integers");
		int n = scan.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			al.add(scan.nextInt());
		}
		insertionSort(al);
	}
	private static void insertionSort(ArrayList<Integer> al) {
  		for (int i = 1; i < al.size(); i++) {
			int val = al.get(i);
			int j = i - 1;                //should mention j outside of the loop if u want to use it outside
			for (j=i-1; j >= 0; j--) {
				if (al.get(j) > val) {
					al.set(j + 1, al.get(j));    // nothing but a[j+1]=a[j]..shifting j to j+1..nothing but right shift by 1 position
				} 
				else            //if it comes into else j-- step wont happen becuase it is bearking before that step
					break;
			}
			al.set(j + 1,val); //setting value in correct position ie j+1
		}
		System.out.println(al);
	}

}
