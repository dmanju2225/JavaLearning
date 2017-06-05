import java.util.ArrayList;
import java.util.Scanner;


public class zerosNnonZerodividing {

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
		ArrayList<Integer> al1=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			if(al.get(i)==0){
				al1.add(al.get(i));
			}
			else{
				al2.add(al.get(i));
			}
		}
		al1.addAll(al2);
		System.out.println(al1);
		
		
	}

}
