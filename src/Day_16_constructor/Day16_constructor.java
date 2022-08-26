package Day_16_constructor;

public class Day16_constructor {

	// constructor have same class name as method name
	// constructer doesn't have return type
	// like it doesn't support public,string,byte
	// creating object of class
	// instantiating
	// created a new instance
	Day16_constructor() {
		System.out.println("Login as admine ");
	}

	// parameterize constructor
	Day16_constructor(String name) {
		System.out.println("logged in as" + name);
	}

	Day16_constructor(String name, String env) {
		System.out.println("logged in as" + name);
		System.out.println("logged in as" + env);
	}

	Day16_constructor(int value) {
		System.out.println("this is :" + value);
	}

	void Hello() {
		System.out.println("this is hello method ");
	}

}
