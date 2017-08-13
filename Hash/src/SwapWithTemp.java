
public class SwapWithTemp {
	public static int a=5;
	public static int b=7;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;
		int b=7;
		swap(a,b);
		System.out.println(a+","+b);

	}

	private static void swap(int a, int b) {
		// TODO Auto-generated method stub
		int temp = a;
		a=b;
		b=temp;
		System.out.println(a+","+b);
	}

}
