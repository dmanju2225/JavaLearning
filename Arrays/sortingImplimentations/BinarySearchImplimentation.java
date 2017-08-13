import java.util.ArrayList;
import java.util.Scanner;
public class BinarySearchImplimentation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("enter arraylist size");
		int n = scan.nextInt();
		System.out.println("enter sorted integers of size " + n);//input should be sorted arraylist
		for (int i = 0; i < n; i++) {
			al.add(scan.nextInt());
		}
		System.out.println("enter which integer to search");
		int Find=scan.nextInt();
		int index=binarySearch(al,0,n-1,Find);
		System.out.println(index);
	}
	private static int binarySearch(ArrayList<Integer> al, int start, int end, int find) {
		if(start>end){
			return -1;  //this will happen for an empty array or if that element is not present in an array
		}
		int mid=start+(end-start/2);
		if(find==al.get(mid)){
			return mid;          //this mid will go to any of the return statmts below.
		}
		else if(find<al.get(mid)){//if less search left array
			return binarySearch(al,start,mid-1,find);
		}
		else{
			return binarySearch(al,mid+1,end,find);//if greater search right array
		}				
	}
}
