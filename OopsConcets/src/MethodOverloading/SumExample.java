package MethodOverloading;

public class SumExample {
public static final int k=10;
public String c1;
	public static int sum(int a, int b)
	{
		System.out.println("int called");
		return a+b;
	}
	public static String sum(String a, String b,double k)
	{
		SumExample.k =10;//here k=10//cannot use this.k=10..//cannot use this in static..//this only can be used in non static method
		System.out.println("String called" +k);
		return a+ b;
	}
	public static int sum(double a, double b)
	{
	//doubt ?how can i change final value//here changing k to  20
	 System.out.println(k);
		System.out.println("double called");
		return (int) (a+b);
	}
	public  int sum(double a, double b,double c,double k)
	{
	//doubt ?how can i change final value//here changing k to  20
	// this.k=30;
	 this.c1="manju";//this refers to which object that is calling sum..since se calling sum that means this refers to se..this refers to object se
	 this.c1="satya";//overriding manju as satya
		System.out.println("double called");
		return (int) (a+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumExample se=new SumExample();
		SumExample se2=new SumExample();
		se.sum(1, 2, 3, 4.9);
		se2.sum(1, 2, 3, 4.8);
		sum(1,2);
		sum("a","b");
		sum(1.0, 2.0);
		
		int x1=Math.max(5,10);//u r calling same method without caring about which one to call
		double x2=Math.max(5.5,5.5);
		

}
}
