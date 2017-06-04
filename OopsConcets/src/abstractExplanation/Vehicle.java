package abstractExplanation;

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
	
	
}
