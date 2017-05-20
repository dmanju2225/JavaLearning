import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class ascendingCharFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String s1 = scan.nextLine();
		descendingCharCount(s1);

	}

	private static void descendingCharCount(String s1) {
		// TODO Auto-generated method stub
		char[] ch = s1.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		if (ch.length == 0) {
			System.out.println("String is empty");
		}
		for (int i = 0; i < ch.length; i++) {
			if (hm.containsKey(ch[i])) {
				int count = hm.get(ch[i]);
				hm.put(ch[i], count + 1);
			} else {
				hm.put(ch[i], 1);
			}
		}
		if (hm.containsKey(' ')) {
			hm.remove(' ');
		}
		int k=hm.size();
		
		for (int i = 0; i<k; i++) {
			Set<Character> set = hm.keySet();
			Iterator<Character> it = set.iterator();
			int max = Integer.MIN_VALUE;
			char chr = 0;
			while (it.hasNext()) {
				Character cr = (Character) it.next();
				if (hm.get(cr) > max) {
					max = hm.get(cr);
					chr = cr;
				}
			}	
			System.out.println("Frequent Character is " + chr
					+ " count of occurance is " + max);
			hm.remove(chr);
		}
	}
		
	}


