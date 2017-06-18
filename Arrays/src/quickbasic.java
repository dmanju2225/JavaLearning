import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class quickbasic {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("enter arraylist size");
		int n=scan.nextInt();
		System.out.println("enter integers of size"+n);
		for(int i=0;i<n;i++){
			al.add(scan.nextInt());
		}
	quickfun3(al,0,n-1);
		System.out.println(al);
	}
	private static int quickfun3(ArrayList<Integer> al,int start, int end) {
		int lastIndex = end -1;
		int i=start;//i is nothing but partition index where u r putting end element
		int pivot = al.get(end);
		while(i<= lastIndex)
		{
			if(al.get(i)< pivot) {
				i++;
				continue;
			}
			if(al.get(lastIndex) > pivot)
			{
				lastIndex--;
				continue;
			}
			Collections.swap(al,i,lastIndex);
			lastIndex--;
			i++;
		}
		Collections.swap(al, i, end);
		return i;
	}
}
