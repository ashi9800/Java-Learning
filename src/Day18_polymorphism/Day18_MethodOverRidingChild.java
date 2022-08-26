package Day18_polymorphism;

public class Day18_MethodOverRidingChild extends Day18_MethodOverridingParant {
	public static void main(String[] args) {
		Day18_MethodOverRidingChild a = new Day18_MethodOverRidingChild();
		a.openbrowser();
	}
	//this is overridding method 
	//parant and child class method name will be same only code will be diffrent 
	//in overriding method it will print code rrom child class
	public void openbrowser() {
		System.out.println("open firefox browser");
		System.out.println("visit the website");
		System.out.println("enter user name");
		System.out.println("enter password");
		System.out.println("click the login button");
	}
	}


