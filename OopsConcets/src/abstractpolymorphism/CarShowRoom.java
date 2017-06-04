package abstractpolymorphism;

import java.util.ArrayList;

public class CarShowRoom {

	ArrayList<Car> al; // default access modifier, only accessible within the package and you need have an instance(object of class) to access
	
	//static String location;
	public CarShowRoom()
	{
		System.out.println("CarshowRoom Constructor Called");
		al = new ArrayList<Car>();
		addSomeCars();
	}
	
	void addSomeCars()
	{
		for(int i=0; i< 1; i++)
		{
			Car c1 = new Car(6,4);
			al.add(c1);
		}
		for(int i=0; i< 1; i++)
		{
			Car c1 = new Car();
			al.add(c1);
			
		}
		
		Vehicle v1 = new Vehicle();
	//	al.add((Car) v1);
	//	System.out.println(v1.getYourType());
		System.out.println(v1);
		System.out.println(v1.getPrice());
		
		
//		Vehicle v3= new Truck();
		// Invalid Type Casting
//		al.add((Car) v3);
//		
		// Valid casting v2 is actually a car.
		Vehicle v2 = new Car();
		al.add( (Car)v2); // Type casting to car because Al expects car and v2 is a car.
		System.out.println(v2);
		System.out.println(v2.getPrice());
		int k=2;
		((Car)v2).setPrice("Satya");
		((Car)v2).setPrice(3.5);
		//System.out.println(v2.getYourType());
		
		// Invalid Type Casting
//		Car c1 = (Car) new Vehicle();
//		System.out.println(c1.getYourType());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub  //we can't access variables declared in class, in the static methods.
		                    //to access u need to create an object of that class by using 'NEW''and then access the class variables 
		                   //using that object in the static method.
		CarShowRoom csr = new CarShowRoom();
		
		
	}
	
	

}
