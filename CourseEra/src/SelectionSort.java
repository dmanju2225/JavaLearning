import java.util.Scanner;
/*find min value in entire array,record index, swap this index with start of array
 * find min value in remaining array follow above steps..no need to sort last element because before all elements will be sorted
 * first assume minIndex is at 0..later change it.
 */

public class SelectionSort {

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
		selectionSort(arr,arrayLength);
		

	}

	private static void selectionSort(int[] arr, int arrayLength) {
		// TODO Auto-generated method stub
		for(int i=0;i<arrayLength-1;i++){
			int minIndex=i;
			for(int j=i+1;j<arrayLength;j++){
				if(arr[j]<arr[minIndex]){
					minIndex=j;
				}
			}
			swap(arr,i,minIndex);
		}
		for(int i=0;i<arrayLength;i++){
		System.out.print(arr[i]);
	}
	}

	private static void swap(int[] arr, int i, int minIndex) {
		// TODO Auto-generated method stub
		int temp;
		temp=arr[i];
		arr[i]=arr[minIndex];
		arr[minIndex]=temp;
		
	}

}
