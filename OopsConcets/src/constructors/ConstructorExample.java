package constructors;

public class ConstructorExample {

	public ConstructorExample(int k) {
		// TODO Auto-generated constructor stub//mostly constructors will be public otherwise all other objects cannot have that property value
		K = k;
	}
	private int K;
	public int getK(){
		return K;
	}
	public void setK(int k){
		this.K=k;
	}
	private String myName;
	
	public static void main(String args[]){
		// we can pass arguments; 
		ConstructorExample ce = new ConstructorExample(10);
		System.out.println(ce.K);
		ce.myName="manju";//doubt how it is accessing non static variable ..how am in able to use same myName
		WithoutMain wm = new WithoutMain();
		int x=wm.setVariable(10);
		System.out.println(x);
		System.out.println(wm.getVariable());
	}
	public static void test(){
		
	ConstructorExample ce = new ConstructorExample(100);
	
	}
}
