import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class appearedMoreThanKTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String s1 = scan.nextLine();
		System.out.println("enter an integer");
		Integer k = scan.nextInt();
		appearedGreaterThanKtimes(s1, k);
	}

	private static void appearedGreaterThanKtimes(String s1, Integer k) {
		// TODO Auto-generated method stub
		char[] ch = s1.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		if (ch.length == 0) {
			System.out.println("String is empty");
		}
		for (int i = 0; i < ch.length; i++) {
			if (hm.containsKey(ch[i])) { // //again same character appears then
											// it will go to if block and
											// get the value of that character
											// from hashmap
				int count = hm.get(ch[i]); // and increase the count by 1
				hm.put(ch[i], count + 1);
			} else {
				hm.put(ch[i], 1); // initially hashmap is empty so it comes to
									// else block and put the value for that
									// character as 1

			}

		}
		if (hm.containsKey(' ')) { // if string contains space and to remove
									// that space once hashmap is created
			hm.remove(' ');
		}
		Set<Character> set = hm.keySet();
		Iterator<Character> it = set.iterator();
		while (it.hasNext()) {
			Character cr = (Character) it.next();

			if (hm.get(cr) > k) { // to print characters appeared more than k
									// times, getting values of each character
									// in hashmap and
									// checking greater or not
				System.out.println(cr);
			}

			// System.out.println(cr);                   // to print distinct characters, hashmap
			                                            // contains unique or distinct values only,
			                                            // thats why iteration over characters in
			                                           // hashmap, you can give integers or string as a
			                                           // input 
		}

	}

}
