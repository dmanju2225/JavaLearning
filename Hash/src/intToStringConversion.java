import java.util.Scanner;


public class intToStringConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter an integer");
		int num=scan.nextInt();
		conversion(num);
		
		

	}

	private static void conversion(int num) {
		//System.out.println(String.valueOf(num)); this is direct inbuilt approach to convert
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		while(num>0){
        int n=num%10;
        num=num/10;
       char ch=(char)(n+'0');//to convert integer n to character , add integer n +ascii value of char 0 ,'0'
                             // for ex for first loop n=4 and ascii of '0' is 48 ,so 4+48=52 , for character 4('4') ascii value is 52
                             // to get character of that ascii value , do type casting by putting (char)
       sb.append(ch);        // only characters have ascii values, integers does not have ascii values
		
	}
		System.out.println(sb);
		System.out.println(sb.reverse());
	}
}


