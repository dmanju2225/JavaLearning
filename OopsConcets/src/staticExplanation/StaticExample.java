package staticExplanation;

public class StaticExample {
//func
	static SumExample se=new SumExample();//can create object of another class outside main
	//public static Object st;
	String name;
	static StaticExample st=new StaticExample("satya");//cannot create object outside method..but can create in main or non static method
	StaticExample(String name){
		this.name=name;
		System.out.println(name);
	}
	
	/*Mystring(){
		 Mystring s=new Mystring();//cannot call constructor inside constructor..it is infinite loop
	}
	*/
	int a;
	public void method1(){
		StaticExample st=new StaticExample("manju");
		st.method2();
		se.sum(1.2, 1.3);
		
	}
	
	private void method2() {
		// TODO Auto-generated method stub
		 SumExample se=new SumExample();
		 se5.method1();//cant do it
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i=10;
		//SumExample se=new SumExample();
		
//		System.out.println(se.add(10, 20));
	//	System.out.println(SumExample.sum(10, 20));
		StaticExample st=new StaticExample("manju");
		SumExample se5=new SumExample();
		st2.method1();
		st.method1();//cannot call method1 with st becoz scope of st is only to method1;
		//SumExample.a=100;//no need of object for static variables,or methods, u only use class type//how can value is assigned in this
		//class eventhough a is class variable
		//System.out.println(SumExample.add(10, 20));
		//System.out.println();
	}

}
