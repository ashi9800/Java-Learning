package Day12_Dog_class_object;


public class Day12_method {

	
	public static void main(String[] args) {
		//name();
		//name2("washington");
	//	name3("hassan" ,5);
	//	name3("abdullah",8);
	//	name2("yasar");
		String a = Day();// in return it is going to give me string value tuesday
		System.out.println(a);
		
		String b = month();
		System.out.println(b);

		int c = age();
		System.out.println(c);

		String value = topic("void and nonvoid value ");
		System.out.println(value);
		System.out.println(topic(" tuesday void and nonvoid method "));

		int sum = task();
		System.out.println(sum);

		int sum2 = task2(4, 3);
		System.out.println(sum2);

	}

	// non void method without parameter
	public static String Day() {
		String todaysday = "tuesday";
		return todaysday;

	}

	public static String month() {
		return "aguest";

	}

	// Create method which going to return the age
	// int value
	public static int age() {
		int age = 25;
		return age;
	}

	// without void method with parameter
	public static String topic(String a) {
		return "today we are learning" + a;
	}

	// method without parameter
	public static void name() {
		System.out.println("my name is rahil");
	}

	// method with one parameter
	public static void name2(String a) {
		System.out.println("my name is :" + a);

	}

	// method with two parameter
	public static void name3(String name, int age) {
		System.out.println(name + " is " + age + " year old ");

	}

	public static int task() {
		int a = 10;
		int b = 20;
		int sum = a + b;
		return sum;
	}

	public static int task2(int a, int b) {
		int sum = a + b;
		return sum;
	}

}
