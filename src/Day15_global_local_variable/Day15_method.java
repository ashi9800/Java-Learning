package Day15_global_local_variable;

public class Day15_method {

	public static void main(String[] args) {
		 Day15_method aa = new  Day15_method();
		methodone();
		aa.methodtwo();
		aa.methodthree();
	}
	public static void methodone() {
		System.out.println("this is method one ");
	}
	
	public void methodtwo() {
		System.out.println("this is method two");
	}
	public String methodthree() {
		return "Hello";
	}

}
