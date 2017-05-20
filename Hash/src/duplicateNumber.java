import java.util.ArrayList;
import java.util.Scanner;


public class duplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		ArrayList<Integer> AL= new ArrayList<Integer>();
		int i = 0;
		while(i<n){
			 AL.add(scan.nextInt());
			 i++;
		}
		scan.close();
		int dupNum=method(AL);
		System.out.println(dupNum);
		

	}
    
	private static int method(ArrayList<Integer> al) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for(Integer x: al){
			sum=sum+x;
		}
		int n = al.size()-1;
		int dupNum = sum-((n*(n+1))/2);
		return dupNum;
	}

	}


