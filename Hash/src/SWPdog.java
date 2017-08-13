
public class SWPdog {
	private String name;//for private variable u can assign value only by defining constructor if u don't define setter
	                    //u can assign value by defining only setter without constructor as well
	public String name2;//for public variable u can assign value directly with object without explicitly defining constructor
	public SWPdog(String dog) {
		// TODO Auto-generated constructor stub
		this.setName(dog);//this.name=dog and dog value is MAX//since anyway setter iis there so used setName(dog)
	}
	public SWPdog() { //no need of explicitly defining default constructor
		// TODO Auto-generated constructor stub//default constructor
	}
	public String getName() {//to access but not modify private variable by any other class they can access through getName
		return name;
	}
	public void setName(String name) {//to change the value of private variable or set the value by other class, it can 
		                                //call set and pass value(class has control over them)
		this.name = name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SWPdog adog = new SWPdog("MAX");//also can write empty constructor, and adog.setName("Max")
		SWPdog adog2 = new SWPdog();
		adog2.name2="Max2";
		foo(adog);
		
	    // aDog variable is still pointing to the "Max" dog when foo(...) returns
	    System.out.println(adog.getName().equals("MAX")); // true, java passes by value
	    System.out.println(adog.getName().equals("Fifi")); // false 
	    foo2(adog);
	    System.out.println(adog.getName().equals("MAX")); // false
	    System.out.println(adog.getName().equals("Fifi")); // true
	}
	public static void foo(SWPdog d) {
	    System.out.println(d.getName().equals("MAX")); // true
	    // change d inside of foo() to point to a new Dog instance "Fifi"
	    d = new SWPdog("Fifi");
	    System.out.println(d.getName().equals("Fifi")); // true
	}
	public static void foo2(SWPdog d) {
	    System.out.println(d.getName().equals("MAX")); // true
	    // change d inside of foo() to point to a new Dog instance "Fifi"
	    d.setName("Fifi");
	    System.out.println(d.getName().equals("Fifi"));//true
	}
}

