import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class wordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String s1=scan.nextLine();
		String[] s2=s1.split("\\s+");
		numOfCount(s2);

	}

	private static void numOfCount(String[] s2) {
		// TODO Auto-generated method stub
		if(s2.length==0){
			System.out.println("String is Empty");
		}
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for(int i=0;i<s2.length;i++){
			if(hm.containsKey(s2[i])){
				int count=hm.get(s2[i]);
				hm.put(s2[i],count+1);
				
			}
			else{
				hm.put(s2[i],1);
			}
		}
		Set set=hm.keySet();
		Iterator it=set.iterator();
		while(it.hasNext()){
			String s3=(String)it.next();
			System.out.println("Key is "+s3+" Value is "+hm.get(s3));
		}
		
	}

}
