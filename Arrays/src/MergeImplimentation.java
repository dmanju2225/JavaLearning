import java.util.ArrayList;
import java.util.Scanner;


public class MergeImplimentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of arraylist");
		int n=scan.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("enter list of integeres unsorted");
		for(int i=0;i<n;i++){
			al.add(scan.nextInt());
		}
		ArrayList<Integer> al1=mergesort(al);
		System.out.println(al1);

	}

	private static ArrayList<Integer> mergesort(ArrayList<Integer> al) {
		// TODO Auto-generated method stub
		if(al.size()<=1){
			return al;
		}
		ArrayList<Integer> L= new ArrayList<Integer>(al.subList(0,(al.size()/2)));
		//System.out.println(L);
		ArrayList<Integer> R=new ArrayList<Integer>(al.subList((al.size()/2),al.size()));
		//System.out.println(R);
		ArrayList<Integer> L1=mergesort(L);
		ArrayList<Integer> L2=mergesort(R);
		//System.out.println(L1);
		//System.out.println(L2);
		ArrayList<Integer> sortedArray=merge(L1,L2);
		//System.out.println(sortedArray);
		return sortedArray;
	}

	private static ArrayList<Integer> merge(ArrayList<Integer> l1,
			ArrayList<Integer> l2) {
		// TODO Auto-generated method stub
		int start1=0;
		int start2=0;
		ArrayList<Integer> res=new ArrayList<Integer>();
		while(start1<l1.size()&&start2<l2.size()){
			if(l1.get(start1)<l2.get(start2)){
				res.add(l1.get(start1));
				start1++;
			}
			else{
				res.add(l2.get(start2));
				start2++;
			}
		}
		while(start1<l1.size()){
			res.add(l1.get(start1));
			start1++;
		}
		while(start2<l2.size()){
			res.add(l2.get(start2));
			start2++;
		}
		//System.out.println(res);
		return res;
	}

	
}
