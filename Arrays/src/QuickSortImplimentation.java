import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuickSortImplimentation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("enter arraylist size");
		int n = scan.nextInt();
		System.out.println("enter integers of size" + n);
		for (int i = 0; i < n; i++) {
			al.add(scan.nextInt());
		}
		quickSort(al,0,n-1);
		System.out.println(al);
	}
	

	private static void quickSort(ArrayList<Integer> al, int start, int end) {
		if(start>=end){
			return ;
		}
		int pi=partitionFunction(al,start,end);//pi is partition index
		quickSort(al,start,pi-1);
		quickSort(al,pi+1,end);	
	}


	private static int partitionFunction(ArrayList<Integer> al, int start,int end) {
		int i = start;
		int lastindex = end - 1;
		int pivot = al.get(end);
		while (i <= lastindex) {
			if (al.get(i) < pivot) {
				i++;
				continue;
			}
			if (al.get(lastindex) > pivot) {
				lastindex--;
				continue;
			}
			Collections.swap(al, i, lastindex);
			lastindex--;
			i++;
		}
		Collections.swap(al, i, end);
		return i;
	}

}
