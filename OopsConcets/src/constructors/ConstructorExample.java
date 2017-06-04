package constructors;

public class ConstructorExample {

	private ConstructorExample(int k) {
		// TODO Auto-generated constructor stub
		K = k;
	}
	private int K;
	
	public static void main(String args[]){
		// we can pass arguments; 
		ConstructorExample ce = new ConstructorExample(10);
		System.out.println(ce.K);
		
		WithoutMain wm = new WithoutMain();
		wm.setVariable(10);
		System.out.println(wm.getVariable());
	}
}
