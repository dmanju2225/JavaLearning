package constructors;

public class Car extends Vehicle {
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
		super(wheelCount);// calls constructor of parent Vehicle
		this.setAirBags(airBags);
		System.out.println("Car Class Constuctor called with AirBags" + this.getAirBags());
		this.meth1();//to call meth1 of class car u need an object defined in this scope but there is no object in this scope
		            //we need to call meth1 using this..this.meth1() ..this acts as an object of class car
		super.meth2();//to call meth2 of parent class vehicle u need to use super since there is meth2 in child class car 
	}
	public void meth1(){
		System.out.println("called meth1");
	}
	//public void meth2(){
		//System.out.println("called meth2");
	//}
	
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
