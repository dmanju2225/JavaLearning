import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class leastFreqchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = s1.replaceAll("\\s", "");
		System.out.println(s2);
		leastFreqChar(s2);
		scan.close();

	}

	private static void leastFreqChar(String s2) {
		// TODO Auto-generated method stub
		char[] ch = s2.toCharArray();
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
		/*
		 * if(hm.containsKey(' ')){ hm.remove(' '); }
		 */
		Set<Character> set = hm.keySet();
		Iterator<Character> it = set.iterator();
		int min = Integer.MAX_VALUE;

		while (it.hasNext()) {
			Character cr = (Character) it.next();
			if (hm.get(cr) < min) {
				min = hm.get(cr);

			}

		}
		/*
		 * for(int i=0;i<ch.length;i++){ if(hm.get(ch[i])==min){
		 * System.out.println
		 * ("least frequent character is "+ch[i]+" count of occurance is "+min);
		 * 
		 * }
		 * 
		 * }
		 */
		Set<Character> set2 = hm.keySet();
		Iterator<Character> it2 = set.iterator();

		while (it2.hasNext()) {
			Character chr = (Character) it2.next();
			if (hm.get(chr) == min) {
				System.out.println("least frequent character is " + chr
						+ " count of occurance is " + min);
			}
		}
	}
}