import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class FrequentChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String s1 = scan.nextLine();
		System.out.println("enter an integer");
		Integer k=scan.nextInt();
		char[] ch1 = s1.toCharArray();
		//HashMap<Character, Integer> hm =freqChar(ch1,k);
		freqChar(ch1,k);
	}

	private static void freqChar(char[] ch1,int k) {
		// TODO Auto-generated method stub
		if (ch1.length == 0) {
			System.out.println("String is empty");
		}

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		// HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		for (int i = 0; i < ch1.length; i++) {
			if (hm.containsKey(ch1[i])) {
				int count = hm.get(ch1[i]);
				hm.put(ch1[i], count + 1);

			} else {
				hm.put(ch1[i], 1);
			}
		}
		if (hm.containsKey(' ')) { // it will check for character space in
									// hashmap, if it is there it will remove
									// and print it in next step
			hm.remove(' '); // then no need to use replaceAll method
		}
		/*Set<Character> set = hm.keySet();
		Iterator<Character> it = set.iterator();
		int max = Integer.MIN_VALUE;

		while (it.hasNext()) {
			Character cr = (Character) it.next();

			if (hm.get(cr) > max) {
				max = hm.get(cr);

			}
		}*/
		
		
		 
		 for (int i =0; i<k;i++){
		      Set<Character> set = hm.keySet();
		    Iterator<Character> it = set.iterator();
		        int max = Integer.MIN_VALUE;
		        char max_char=0;
		        while (it.hasNext()) {
					Character cr = (Character) it.next();

					if (hm.get(cr) > max) {
						max = hm.get(cr);
						max_char = cr;
					}
				}
			System.out.println("freq character is "+max_char+" count of occurance is "+max); 
			hm.remove(max_char);
 		}
		 
		 
		/*
		 * for(int i=0;i<ch1.length;i++){ if(hm.get(ch1[i])==max){
		 * System.out.println
		 * ("most frequent character is "+ch1[i]+" count of occurance is "+max);
		 * 
		 * }
		 */
		
		/*Set<Character> set2 = hm.keySet();
		Iterator<Character> it2 = set.iterator();
		while (it2.hasNext()) {
			Character chr = (Character) it2.next();
			
			if (hm.get(chr) == max) {
				/*System.out.println("most frequent character is " + chr
						+ " count of occurance is " + max);*/
			 /*System.out.println(" freq character is "+chr+" count is "+max);
			 hm.remove(chr);
			}
		
			 if (hm.get(chr) > max) {
					max = hm.get(chr);

				}
			}*/
			

	



		
	}
}
