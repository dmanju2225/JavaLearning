package abstractpolymorphism;

public class Vehicle {
	
	private int wheelCount;
	
//	private String colorType;
	private double price =10;
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
	
	public static String getYourType()
	{
		return "Vehicle";
	}
	public String toString()
	{
		return "Vehicle with WheelCount :" + this.wheelCount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
