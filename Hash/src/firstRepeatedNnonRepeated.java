import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;


public class firstRepeatedNnonRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=scan.nextLine();
		char[] ch=s1.toCharArray();
		firstRepeated(ch);
		firstNonRepeated(ch);

	}

	private static void firstRepeated(char[] ch) {
		// TODO Auto-generated method stub
		//HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		TreeMap<Character,Integer> tm=new TreeMap<Character,Integer>();
		for(int i=0;i<ch.length;i++){
			if(tm.containsKey(ch[i])){
				System.out.println("first repeated character is "+ch[i]);
				break;
			}
			else{
				tm.put(ch[i],1);
			}
		}
	}
	private static void firstNonRepeated(char[] ch) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> hm2=new HashMap<Character,Integer>();
		for(int i=0;i<ch.length;i++){
			if(hm2.containsKey(ch[i])){
				int count=hm2.get(ch[i]);
				hm2.put(ch[i], count+1);
			}
			else{
				hm2.put(ch[i],1);
			}
		}
		for(int i=0;i<ch.length;i++){
			if(hm2.get(ch[i])==1){
				System.out.println("first non repeated character is "+ch[i]);
				break;
				
			}
			}
		}
	}
	

