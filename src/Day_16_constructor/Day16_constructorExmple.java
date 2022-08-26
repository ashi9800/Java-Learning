package Day_16_constructor;

public class Day16_constructorExmple {

	public static void main(String[] args) {
	//default consctructer (it doesn't have any parameters) 
		//on order to called all method from constructor class we need to make each method of object of class 
		Day16_constructor  cons = new Day16_constructor();
		Day16_constructor para_cons = new  Day16_constructor("administrator");
		Day16_constructor para_cons1 = new  Day16_constructor("editior");
		 Day16_constructor para_cons2 = new  Day16_constructor(1000);
		 //calling method using object name.method
	     cons.Hello();
	     para_cons.Hello();
	    
	     
	     //this is class refrence when the  method is declard static  
	   //  Day16_constructor.Hello();
	}

}
