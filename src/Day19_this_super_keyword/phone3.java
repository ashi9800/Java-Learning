package Day19_this_super_keyword;

class phone2 {
	phone2() {
		System.out.println("this is phone constructor");
	}

	phone2(String name) {
		System.out.println("this is parameterized constructor");
	}

	phone2(String name, int age) {
		System.out.println("this is parameterized constructor" + name + age);
	}
}

class SmartPhone1 extends phone2 {
	SmartPhone1() {
		super("jhon", 20);
		System.out.println("this is a samrt phone constructor");
	}
}

	public class phone3 {
		public static void main(String[] args) {
			SmartPhone1 a = new SmartPhone1();

		}

	}

