package constructors;

public class WithoutMain {

	private int variable;
    private String myName;
	public int getVariable() {
		System.out.println("Getting the Variable : " + variable);
		return variable;
	}

	public void setVariable(int variable) {
		if(variable < 0) throw new IndexOutOfBoundsException("Value should be positve");
		System.out.println("Setting the Variable : " + variable);
		this.variable = variable;
	}
	
	public void myFunction()
	{
		myName = "Satya";
	}
}
