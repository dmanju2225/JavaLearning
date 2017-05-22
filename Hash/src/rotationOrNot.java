import java.util.Scanner;


public class rotationOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string1");
		String s1=scan.nextLine();
		System.out.println("enter string2");
		String s2=scan.nextLine();
		String s3=rotation(s1);
		String s4=rotation(s3);
		if(s2.equals(s3)||s2.equals(s4)){
			System.out.println("s2 is rotation of s1");
		}
		else{
			System.out.println("s2 is not rotation of s1");
		}

	}

	private static String rotation(String s1) {
		// TODO Auto-generated method stub
		char[] ch1=s1.toCharArray();
		char temp=ch1[0];                  //saving first element is temp becoz in loop first element will become second element
		for(int i=0;i<s1.length();i++){
			
			if(i==(s1.length()-1)){    //if i becomes the last position ,last element become first element and break the for loop
				ch1[i]=temp;
				break;               
			}
			ch1[i]=ch1[i+1];
		}                       //after for loop breaks ,have to convert result array to string
		String s=new String(ch1);  //to convert array ch1 to a string
		
		return s;     // will return the string to calling method s3 first , and s4 second
	}

}
