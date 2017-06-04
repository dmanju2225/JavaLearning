import java.util.Scanner;


public class secondLargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array of integers");
		int[] a=new int[4];
		for(int i=0;i<4;i++){
			a[i]=scan.nextInt();	
		}
		
		
		secondlargest(a);

	}

	private static void secondlargest(int[] a) {
		// TODO Auto-generated method stub
		int max=Integer.MIN_VALUE;
		int second_max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				second_max=max;
				max=a[i];
			}
			else if(a[i]<max&&a[i]>second_max){
				second_max=a[i];
			}
			
		}
		System.out.println(max);
		System.out.println(second_max);
			
	}
}
