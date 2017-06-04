package accessmodifiers;

import constructors.Vehicle2;

public class Factory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.setAirBags(5);
		c1.modelType = "camry";
		c1.trunkSpace = 20;
		c1.colorType = "blue";
		c1.methodUsing();
		Vehicle2 v1=new Vehicle2();
		v1.colorType="blue";
		v1.setWheelCount(4);
		v1.setPrice(10);
		
		
		
	}

}
