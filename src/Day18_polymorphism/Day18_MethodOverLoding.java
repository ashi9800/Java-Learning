package Day18_polymorphism;

public class Day18_MethodOverLoding {

	public static void main(String[] args) {
		addition(20, 30);
		addition(2, 4, 6);
		addition(5 ,6.33f);
	}

//this is exmple of method overloding y changing the parameter
	static void addition(int a, int b) {
		System.out.println(a + b);
	}

	static void addition(int a, int b, int c) {
		System.out.println(a + b + c);

	}
	//this is method overloding by changing the type of variable
	static void addition(int a, float b) {
		System.out.println(a+b);
	}
}
