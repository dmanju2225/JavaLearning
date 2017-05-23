import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class findLongestDistinctSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String s2 = scan.nextLine();
		String s1=s2.replaceAll("\\s","");
		System.out.println(s1);
		ArrayList<String> ar1 = substring(s1);
		System.out.println(ar1);
		ArrayList<String> ar3 = distinctSubstring(ar1);
		System.out.println(ar3);
        longestSubstring(ar3);
	}

	

	private static ArrayList<String> substring(String s1) {
		// TODO Auto-generated method stub
		ArrayList<String> ar = new ArrayList<String>();
		for (int i = 0; i < s1.length(); i++) {
			for (int j =i+1; j<=s1.length(); j++) {
				ar.add(s1.substring(i, j));
			}
		}
		
		return ar;

	}

	private static ArrayList<String> distinctSubstring(ArrayList<String> ar1) {
		// TODO Auto-generated method stub
		//HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		HashSet<Character> hs=new HashSet<Character>();
		ArrayList<String> ar2 = new ArrayList<String>();
		for(String s:ar1){
			int flag=0;
			char[] ch=s.toCharArray();
			for(int i=0;i<ch.length;i++){
				if(hs.contains(ch[i])){
					flag=1;
					break;
				}
				else{
					hs.add(ch[i]);
				}
			}
			if(flag==0){
				ar2.add(s);	     
			}
			hs.clear();	
			
		}
		return ar2;
		/*ArrayList<String> ar2 = new ArrayList<String>();
		for (String s : ar1) {
			int flag = 0;
			char[] ch = s.toCharArray();
			for(int i=0;i<ch.length;i++){
				for(int j=i+1;j<ch.length;j++){
					if(ch[i]==ch[j]){
						flag=1;
						break;
					}
				}
				if(flag==1){
					break;
				}
			}
			if(flag==0){
				ar2.add(s);
			}
		}
		return ar2;*/
	}
	private static void longestSubstring(ArrayList<String> ar3) {
		// TODO Auto-generated method stub
		int max=Integer.MIN_VALUE;
		String max_string = null;
		for(String s:ar3){
			if(s.length()>max){
				 max=s.length(); 
				 max_string = s; 
			}
		}
		System.out.println(max_string);
		/*for(String s:ar3){
			if(s.length()==max){
				System.out.println(s);
			}
		}*/
	}
}
