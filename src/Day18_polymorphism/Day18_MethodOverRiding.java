package Day18_polymorphism;

public class Day18_MethodOverRiding extends  Day18_MethodOverridingParant{

	public static void main(String[] args) {
		Day18_MethodOverRiding a = new Day18_MethodOverRiding();
		
		//this will print value from parant class bcoz we didn't override method in child class 
		//if we override method in child class then it won't be printing code from parent class //it will print code from childclass
       a.openbrowser();
	}

}
