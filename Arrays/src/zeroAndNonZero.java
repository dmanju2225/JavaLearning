import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class zeroAndNonZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of arraylist");
		int n=scan.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("enter arrayList elements of size"+n);
		for(int i=0;i<n;i++){
			al.add(scan.nextInt());
		}
		zeroAndNonZero(al,n);

	}

	private static void zeroAndNonZero(ArrayList<Integer> al, int n) {
		// TODO Auto-generated method stub
		int start=0;
		int end=al.size()-1;
		while(start<end){
			if(al.get(start)!=0){
				start++;
			}
			else if (al.get(end)==0){
				end--;
			}
			else if(al.get(start)==0&&al.get(end)!=0){
				Collections.swap(al,start,end);
			}
		}
		System.out.println(al);
	}

	

}
