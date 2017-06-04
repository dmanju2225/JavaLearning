package staticExplanation;

public class StaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumExample se=new SumExample();
		System.out.println(se.add(10, 20));
		System.out.println(SumExample.sum(10, 20));
		SumExample.a=100;//no need of object for static variables,or methods, u only use class type
		//System.out.println(SumExample.add(10, 20));
	}

}
