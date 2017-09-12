import java.util.Scanner;
/*take each element insert in right position relative to before elements
 * but as position changes new elements will insert in array ..assume position and current index are equal and start with 1
 * compare that element with previous elements to insert(swapping) and currentIndex become currentIndex-1
 */
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length of array");
		int arrayLength=scan.nextInt();
		System.out.println("enter integers of arraylength "+arrayLength);
		int[] arr=new int[arrayLength];
		for(int i=0;i<arrayLength;i++){
			arr[i]=scan.nextInt();
		}
		insertionSort(arr,arrayLength);
	}

	private static void insertionSort(int[] arr, int arrayLength) {
		// TODO Auto-generated method stub
		int position;
		int currentIndex;
		for(position=1;position<arrayLength;position++){
			currentIndex=position;
			while(currentIndex>0&&arr[currentIndex]<arr[currentIndex-1]){
				swap(arr,currentIndex,currentIndex-1);
				currentIndex=currentIndex-1;
			}
		}
		for(int i=0;i<arrayLength;i++){
			System.out.print(arr[i]);
		}
		
	}

	private static void swap(int[] arr, int currentIndex, int i) {
		// TODO Auto-generated method stub
		int temp;
		temp=arr[currentIndex];
		arr[currentIndex]=arr[i];
		arr[i]=temp;
		
	}

}
