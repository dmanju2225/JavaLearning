package constructors;

public class WithoutMain {

	private int variable;
    private String myName="satya";
	public int getVariable() {
		System.out.println("Getting the Variable : " + variable);
		return variable;
	}

	public int setVariable(int variable) {
		if(variable < 0) throw  new IndexOutOfBoundsException("value should be positive");
		//System.out.println("Setting the Variable : " + variable);
		return this.variable = variable;
	}
	
	public void myFunction()
	{
		//myName = "Satya";//doubt does it mean only objects can read this value and cannot modify
		                  //how will they able to modify
		ConstructorExample ce = new ConstructorExample(10);
		System.out.println(ce.getK());
	}
}
