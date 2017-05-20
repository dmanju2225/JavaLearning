import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class charCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=scan.nextLine();
		//String noSpace=s1.replaceAll("\\s","");//if we do not use replaceAll method to eliminate space in the string we will get count for space also
		//char[] ch1=noSpace.toCharArray();
		char[] ch1=s1.toCharArray();
		numOfCount(ch1);
	
	}

	private static void numOfCount(char[] ch1) {
		// TODO Auto-generated method stub
	if(ch1.length==0){
		System.out.println("String is empty");
	}

	HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	//HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	for(int i=0;i<ch1.length;i++){
		if(hm.containsKey(ch1[i])){
			int count=hm.get(ch1[i]);
			hm.put(ch1[i],count+1);
			
		}
		else{
			hm.put(ch1[i],1);
		}
	}
		if(hm.containsKey(' ')){         //it will check for character space in hashmap, if it is there it will remove and print it in next step
			hm.remove(' ');             //then no need to use replaceAll method
		}
	
	//hm.keySet();
	/*Set<Character> set=hm.keySet();
	Iterator<Character> it= set.iterator();
	while(it.hasNext()){
		Character cr=(Character)it.next();
		System.out.println("Key is "+cr+" Value is "+hm.get(cr));
	}*/
	System.out.println(hm);
	}
}
		
	


