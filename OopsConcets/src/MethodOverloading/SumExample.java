package MethodOverloading;

public class SumExample {

	public static int sum(int a, int b)
	{
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
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(1,2);
		sum("a","b");
		sum(1.0, 2.0);
	}

}
