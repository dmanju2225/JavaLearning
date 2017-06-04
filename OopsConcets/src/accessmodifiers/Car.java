package accessmodifiers;
import constructors.Vehicle2;

public class Car extends Vehicle2 {
//	private String fuelType;
	protected double trunkSpace;
	private int airBags;
	public String  modelType;

	
	public Car()
	{
		this.setAirBags(2);
		super.setWheelCount(4); // calling member in super class
		super.price3=100;
		super.setPrice2(50);
		super.setPrice4(20);
	}
	public Car(int airBags, int wheelCount)
	{
		super(wheelCount);// calls constructor
		this.setAirBags(airBags);
		System.out.println("Car Class Constuctor called with AirBags" + this.getAirBags());
		this.price = 100;
	//	this.price2= 200;
	}
	
//	public String toString()
//	{
//		return "WheelCount of Car::" + Integer.toString(getWheelCount());
//	}
//	public double getTrunkSpace() {
//		return trunkSpace;
//	}
//	public void setTrunkSpace(double trunkSpace) {
//		this.trunkSpace = trunkSpace;
//	}

	public int getAirBags() {
		return airBags;
	}

	public void setAirBags(int airBags) {
		this.airBags = airBags;
	}
}
