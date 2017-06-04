import java.util.Scanner;


public class intersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of both the arrays");
		int n=scan.nextInt();
		int[] a=new int[n];
		System.out.println("enter an array of size n: ");
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		int[] b=new int[n];
		System.out.println("enter an array of size n: ");
		for(int j=0;j<n;j++){
			b[j]=scan.nextInt();
		}
		intersection(a,b,n);
		
		

	}

	private static void intersection(int[] a, int[] b,int n) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++){
					if(a[i]==b[j]){
					 System.out.print(a[i]+" ");
					}
				}
			}
			
		}
		
	}


