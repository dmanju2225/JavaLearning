package staticExplanation;

public class SumExample {
  //static //  static
    int d;//what is static..how else u can assign value
public static int a;
   
	public static  int sum(int a, int b)
	{
		 int c=0;//cannot put static for a variable as it is in a method, if u put static for a variable it is a class variable
		System.out.println("int called");
		int h=d+a;//static methods cannot access non static variables or methods
		
		a=10;//doubt which a it is taking static or not
		return a+b;
	}
	
	public static String sum(String a, String b)
	{
		final int k =10;//y only final, no other modifier allowed
		a="20";//doubt can i give value to static a
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
		return (int) (a+b);//type casting from double to int
		//cannot call non static methods without object
		//return sum(a,b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumExample se=new SumExample();//doubt to be clarify can we create two objects with same name in different classes
		sum(1,2);
		sum("a","b");
		sum(1.0, 2.0);
		se.a = 10;
		System.out.println(a);
	//	StaticExample.st.a = 100;
		
	}

}
