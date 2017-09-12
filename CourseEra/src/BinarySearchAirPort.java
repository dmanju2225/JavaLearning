import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BinarySearchAirPort implements Comparable<BinarySearchAirPort> {
	private String city;
	private String country;
	private String code3;

	public BinarySearchAirPort(String city, String country, String code3) {
		// TODO Auto-generated constructor stub
		this.city = city;
		this.country = country;
		this.code3 = code3;

	}
	public String toString()//need to mention tostring() for custom objects if u want to print content of object as a list
	{
		
		return "Hey "+ city + " " + country + " " + code3;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter city to search to get code");
		String cityToSearch = scan.nextLine();
		System.out.println("enter legth of array");
		int n = scan.nextInt();
		scan.nextLine();// reading newline again,cannot give nextInt and
						// Nextline immediately..after integer if u press enter
						// it is considered as nextline

		BinarySearchAirPort[] airports = new BinarySearchAirPort[n];
		for (int i = 0; i < n; i++) {
			System.out.println("enter city ,country and code");
			airports[i] = new BinarySearchAirPort(scan.nextLine(), scan.nextLine(), scan.nextLine());
		}
		// String code=findAirportCode(cityToSearch,airports,n);
		// sort by city name;
		List<BinarySearchAirPort> l = Arrays.asList(airports);// l stores references of objects
		 System.out.println(l);//it print content of object if u implement toString() method
		                       //if u do not implement toString() it prints references since airports is custom objects
		 //if they are java defined objects no need to explicitly implement toString()
		String code = findAirportCodeUsingBinarySearch(cityToSearch, airports);
		System.out.println(code);
	}

	public static String findAirportCode(String toFind, BinarySearchAirPort[] airports, int n) {
		for (int i = 0; i < n; i++) {
			if (airports[i].getCity().equalsIgnoreCase(toFind)) {
				return airports[i].getCode3();
			}
		}
		// String nocode = "does not exist";
		return "does not exist";// nocode;
	}

	public static String findAirportCodeUsingBinarySearch(String toFind, BinarySearchAirPort[] airports) {

		int low = 0;
		int high = airports.length - 1;
		int mid;
		while (low <= high) {
			mid = low + ((high - low) / 2);
			int compare = toFind.compareTo(airports[mid].getCity());
			if (compare < 0) {
				high = mid - 1;
			} else if (compare > 0) {
				low = mid+1;
			} else
				return airports[mid].getCode3();
		}
		return null;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public String getCode3() {
		return code3;
	}

	@Override
	public int compareTo(BinarySearchAirPort airport) {
		// TODO Auto-generated method stub
		if (this.getCity().compareTo(airport.getCity()) == 1) {
			return 1;
		} else if (this.getCity().compareTo(airport.getCity()) == -1) {
			return -1;
		} else
			return 0;
	}

}
