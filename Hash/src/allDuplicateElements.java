import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class allDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		ArrayList<Integer> AL= new ArrayList<Integer>();
		int i = 0;
		while(i< n){
			 AL.add(scan.nextInt());
			 i++;
		}
		scan.close();
		Set<Integer> res=allDup(AL);
		System.out.println(res);

	}

	private static Set<Integer> allDup(ArrayList<Integer> AL) {
		// TODO Auto-generated method stub
		Set<Integer> res= new HashSet<Integer>();	
		HashSet<Integer> set=new HashSet<Integer>();
		for(Integer x:AL){
			if(!set.add(x)){
				res.add(x);
				
			}
			
		}
		return res;
	}
	

}
