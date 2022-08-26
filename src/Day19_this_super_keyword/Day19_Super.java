package Day19_this_super_keyword;

//sub class 
//also parent class 
//super keyword we can only use with inheritance 
//but this keyword we can use anywhere 
class Phone1{
	String make = "iphone";
	String color = "black";
	void Hello() {
		System.out.println("this method is in parent class");
	}
	
}
class SmartPhone extends Phone1 {
	//this is overriding so it will print sumsang 
	String make = "sumsang";
	String color = "yellow";
	void Hello() {
		System.out.println("this method in child class");
	}
	
	void displaychildmake() {
		//by using super it will called method from parent class
		super.Hello();
		System.out.println("the phone is :"+make);
		System.out.println("the color is :"+ color);
	}
	void displayparentmambere() {
		//using super keyword will get value from parent class instated of getting value from child class
		//super keyword  in inheritance use to access variable and the method from parent class methods and instance variables

		System.out.println("this will print parent member :"+super.make);
		System.out.println("this will print the  color  :"+super.color);
	}
}


public class Day19_Super {
	public static void main(String[] args) {
		SmartPhone a = new SmartPhone();
        a.displaychildmake(); 
        a.displayparentmambere();
	}

}
