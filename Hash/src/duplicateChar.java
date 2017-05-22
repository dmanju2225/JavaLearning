import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class duplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=scan.nextLine();
		duplicateCharacters(s1);

	}

	private static void duplicateCharacters(String s1) {
		// TODO Auto-generated method stub
		char[] ch=s1.toCharArray();
		HashMap<Character,Integer> hm1=new HashMap<Character,Integer>();
		for(int i=0;i<ch.length;i++){
			if(hm1.containsKey(ch[i])){
				int count=hm1.get(ch[i]);
				hm1.put(ch[i], count+1);
			}
			else{
				hm1.put(ch[i],1);
			}
		}
		Set<Character> set=hm1.keySet();
		Iterator<Character> it=set.iterator();
		while(it.hasNext()){
			Character cr=(Character)it.next();
			if(hm1.get(cr)>1){
				System.out.println(cr);
			}
		}
		
	}
}