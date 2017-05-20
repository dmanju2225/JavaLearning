import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class missingTwoElements {
	static ArrayList<Integer> Missing1 = new ArrayList<Integer>();
	static ArrayList<Integer> Missing2 = new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		int i = 0;
		//while(i<n){
		while (i < n-1) {
			al.add(scan.nextInt());
			i++;
		}
		//ArrayList<Integer> Missing = method(al, n);
		//System.out.println(Missing);
		//ArrayList<Integer> Missing2 = method1(al, n);
		Set<Integer> Missing3 = method2(al, n);
		System.out.println(Missing3);
	}

	private static ArrayList<Integer> method(ArrayList<Integer> al, int n) {
		// TODO Auto-generated method stub

		// [0,1,2]
		for (int i = 0; i <= n; i++) {
			boolean found = false;

			for (Integer temp : al) {

				if (temp == i) {
					found = true;
				}
			}
			if (found == false) {
				Missing1.add(i);
			}
		}

		return Missing1;
	}


private static ArrayList<Integer> method1(ArrayList<Integer> al, int n) {
	for(int i=0;i<=n;i++){
		if(al.contains(i)==false){
	    Missing2.add(i);
		}
		
	}
	return Missing2;
	
	
}
private static Set<Integer> method2(ArrayList<Integer> al, int n) {
	Set<Integer> set=new HashSet<Integer>();
	for(int x: al){
		set.add(x);
	}
	
	return set;
}
}


