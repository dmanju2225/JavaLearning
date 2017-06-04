package abstractExplanation;

public abstract class Car extends Vehicle{
//	private String fuelType;
//	private double trunkSpace;
	private int airBags;
	public Car()
	{
		this.setAirBags(2);
		super.setWheelCount(4); // calling member in super class
	}
	public Car(int airBags, int wheelCount)
	{
		super(wheelCount);// calls constructor
		this.setAirBags(airBags);
		System.out.println("Car Class Constuctor called with AirBags" + this.getAirBags());
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
	public abstract void wheelQuality();//abstract method without body
}
