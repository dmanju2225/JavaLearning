package staticExplanation;

public class SumExample {
 static int a;
	public static int sum(int a, int b)
	{
		static int c=0;//cannot put static for a variable as it is in a method, if u put static for a variable it is a class variable
		System.out.println("int called");
		return a+b;
	}
	public static String sum(String a, String b)
	{
		final int k =10;
		
		System.out.println("String called" +k);
		return a+ b;
	}
	public static int sum(double a, double b)
	{
		System.out.println("double called");
		return (int) (a+b);
		//return add(a,b);//cannot call non static methods from static methods
		
	}
	public  float add(double a, double b)
	{
		System.out.println("float called");
		return (int) (a+b);
		//return sum(a,b);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(1,2);
		sum("a","b");
		sum(1.0, 2.0);
	}

}
