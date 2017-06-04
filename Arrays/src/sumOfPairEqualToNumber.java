import java.util.Arrays;
import java.util.Scanner;

public class sumOfPairEqualToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=scan.nextInt();
		System.out.println("enter the expecting sum");
		int x=scan.nextInt();
		int[] a=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		Arrays.sort(a);//if u don't sort o/p will be (1,2) and also (2,1) but we need only once so sort it. o/p ex:(1,2) (2,1)
		sumOfPair(a,n,x);
			
	}

	private static void sumOfPair(int[] a, int n,int x) {
		// TODO Auto-generated method stub
		int flag=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if((a[i]+a[j])==x){
			    System.out.println(a[i]+" "+a[j]);
				}
				if(a[i]==a[j]){ //if u don't check for this, will get o/p redundantly as both the values are same(running loop again for same number bot necessary)
					flag=1;     //and also o/p will be ex:(1,2) (1,2)...
					break;
				}
			}
//			if(flag==1){
//				continue;
//			}
			
		}
		
	}

}
