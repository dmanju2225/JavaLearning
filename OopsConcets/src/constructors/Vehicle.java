package constructors;

public class Vehicle {
	
	private int wheelCount;
//	private String colorType;
//	private double price;
//	
	public Vehicle()
	{
		
	}
	public Vehicle(int wheelCount)
	{
		this.wheelCount = wheelCount;
		System.out.println("Vehicle Class Constuctor called with wheelcount" + this.wheelCount);
	}

	public int getWheelCount() {
		return wheelCount;
	}

	public void setWheelCount(int wheelCount) {
		this.wheelCount = wheelCount;
	}
	public void meth1(){
		System.out.println("vehicle called meth1");
	}
	public void meth2(){
		System.out.println("vehicle called meth2");
	}
	
	
}
