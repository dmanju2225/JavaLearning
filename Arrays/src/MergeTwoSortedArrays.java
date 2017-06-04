import java.util.ArrayList;
import java.util.Scanner;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		System.out.println("enter array1 size");
		int n = scan.nextInt();
		System.out.println("enter list of integers of size " + n);
		for (int i = 0; i < n; i++) {
			al1.add(scan.nextInt());
		}
		System.out.println("enter array2 size");
		int m = scan.nextInt();
		System.out.println("enter list of integers of size " + n);
		for (int i = 0; i < m; i++) {
			al2.add(scan.nextInt());
		}
		merge(al1, al2);
	}
	private static void merge(ArrayList<Integer> al1, ArrayList<Integer> al2) {
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al1.sort(null);
		al2.sort(null);
		int start1 = 0;
		int start2 = 0;
		while(start1 < al1.size() && start2 < al2.size())
		{
			if(al1.get(start1) < al2.get(start2))
			{
				al3.add(al1.get(start1));
				start1++;
			}
			else
			{
				al3.add(al2.get(start2));
				start2++;
			}
		}	//the next steps , to copy all the elements that are left out(already in sorted order) in one array to al3
		while(start1 < al1.size())                      // nothing but (u can also use )if(start2 == al2.size())
		{                                               //either of one while step execute
			al3.add(al1.get(start1));
			start1++;
		}		
		while(start2 < al2.size())                          //if(start1 == al1.size())
		{
			al3.add(al2.get(start2));
			start2++;
		}
		System.out.println(al3);
	}
}
