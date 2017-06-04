package constructors;

abstract class Vehicle2 {
  
	private int wheelCount;
	public String colorType;
	protected double price;
	private double price2;
	protected double price3;
    double price4;
	public Vehicle2()
	{
		
	}
	public Vehicle2(int wheelCount)
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
	public void methodUsing(){
		car2.setPrice2(10000);
		this.setPrice2(10000);
	}
	public double getPrice2() {
		return price2;
	}
	public void setPrice2(double price2) {
		this.price2 = price2;
	}
	public void setPrice4(double price4){
		this.price4=price4;
	}
	
	public double getPrice4(){
		return price4;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public double getPrice(){
		return price;
	}

}
