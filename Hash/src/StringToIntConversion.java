import java.util.Scanner;


public class StringToIntConversion {              //converting string of integers to integer

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string of Integers");
		String s1=scan.nextLine();
		
		try {
			int finalNum = Conversion(s1);
			System.out.println(s1+100);   //100 is appending with string s1
			System.out.println(finalNum);// finalnum is integer we got from string
			System.out.println(finalNum+100);// 100 is added to the converted integer
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("do somethingelse");
			//e.printStackTrace();
		}

		scan.close();

	}
	

	private static int Conversion(String s1) throws Exception {
		// TODO Auto-generated method stub
		int num=0;
		char[] ch1=s1.toCharArray();
		for(int i=0;i<s1.length();i++){
			if(ch1[i] < '0' || ch1[i] > '9')
				throw new Exception("Invalid input Expected Int But got " + ch1[i]  );
			int val=ch1[i]-'0';                                    //int val1='0';  just to print and see ascii value of character 0 that is '0'
			num = num*10 + val;                                       //System.out.println(val1);
		}
		return  num;
	}

}	                           // this stmt is to convert character 0 to 9 to integer of the same ,
			                    //for that subtract ascii value of that char and ascii value of character 0 that is '0' which is 48.
			                    //for ex ascii value of character 1, '1' is 49. now '1'-'0' that is  49-48 which is integer 1
			                    //ascii value of char A is 65, a is 97
			                     //System.out.println(val);
			                     //num=num+val*Math.pow(10,s1.length()-1-i);
			
			
		
