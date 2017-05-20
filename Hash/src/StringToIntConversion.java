import java.util.Scanner;


public class StringToIntConversion {              //converting string of integers to integer

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=scan.nextLine();
		
		try {
			int finalNum = Conversion(s1);
			System.out.println(s1+100);
			System.out.println(finalNum);
			System.out.println(finalNum+100);
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
			int val=ch1[i]-'0';
			//System.out.println(val);
			 //num=num+val*Math.pow(10,s1.length()-1-i);
			num = num*10 + val;
			
		}
		return  num;
	}

}
