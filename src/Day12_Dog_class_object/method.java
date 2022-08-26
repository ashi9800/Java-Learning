package Day12_Dog_class_object;

public class method {
     //main method
	public static void main(String[] args) {
		//in order to run the code or method which is outside of main method we need to called them in the inside main method
	sample();
	hello();
	sum();
	add(10,10);

	}
    //user defined method without parameter 
	public static void sample() {
		System.out.println("hello world");
	}
	//user defined method without parameter 
	public static void hello() {
		System.out.println("hello today we are learnning method");
	}
	//user defined method without parameter 
	public static void sum() {
		int a = 10;
		int b = 15;
		System.out.println(a+b);
				
	}
	//user defined method with parameter 
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	
}
