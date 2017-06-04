package abstractExplanation;

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
			Car c1 = new Car(6,4);//since car is an abstract class cannot create object of that class
			al.add(c1);
		}
		for(int i=0; i< 1; i++)
		{
			Car c1 = new Car();//since car is an abstract class cannot create object of that class
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
