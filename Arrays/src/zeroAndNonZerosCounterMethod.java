import java.util.ArrayList;
import java.util.Scanner;


public class zeroAndNonZerosCounterMethod {

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
		int counter=0;
		for(int i=0;i<al.size();i++){
			if(al.get(i)!=0){
				al.set(counter, al.get(i));
				counter++;
			}
		}
		while(counter<al.size()){
			al.set(counter,0);
			counter++;
		}
		System.out.println(al);
	}

}
