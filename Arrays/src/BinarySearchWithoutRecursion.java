import java.util.ArrayList;
import java.util.Scanner;
public class BinarySearchWithoutRecursion {
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
		int find=scan.nextInt();
		int index=binarySearch(al,0,n-1,find);
		System.out.println(index);

	}
//hi
	private static int binarySearch(ArrayList<Integer> al, int start, int end, int find) {
		while(start<=end){//the loop breaks if it is empty array or if find is not present
			int mid=start+(end-start/2);
			if(find==al.get(mid)){
				return mid;        
			}
			else if(find<al.get(mid)){
				end=mid-1;//changing end positions if find is less
			}
			else{
				start=mid+1;//changing start position if find is greater
			}			
		}
		return -1;
	}

}
