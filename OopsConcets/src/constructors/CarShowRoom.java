package constructors;

import java.util.ArrayList;

public class CarShowRoom {

	ArrayList<Car> al; // default access modifier, only accessible within the package and you need have an instance(object of class) to access
	
	//static String location;
	public CarShowRoom()
	{
		System.out.println("CarshowRoom Constructor Called");
		al = new ArrayList<Car>();//creating empty array list of cars
		addSomeCars();
	}
	
	void addSomeCars()
	{
		for(int i=0; i< 1; i++)
		{
			Car c1 = new Car(6,4);
			c1.meth2();//calls meth2 of child class car ..if there is no meth2 in child class then it calls meth2 in parent class
			c1.meth1();//calls meth1 of class car
			al.add(c1);
		}
		for(int i=0; i< 1; i++)
		{
			Car c1 = new Car();
			al.add(c1);
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub  //we can't access variables declared in class, in the static methods.
		                    //to access u need to create an object of that class by using 'NEW''and then access the class variables 
		                   //using that object in the static method.
		CarShowRoom csr = new CarShowRoom();
		
		
	}
	
	

}
