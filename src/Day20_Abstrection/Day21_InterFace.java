package Day20_Abstrection;

//100% abstrection
//when we have 0 idea what to build and how to build we use interface
//but when we know what to build and how to build then we use abstrectuon 
interface exmple {
   void test();
   void test1();
   void test2();
   int a = 10;
}

interface exmple3 extends exmple {
	void test4();
}

//interface we can't use extends 
//we use implements to call other method 
//we can impliments multipal class
class exmple2 implements exmple3 {
	public void test() {
		System.out.println("This is test method");
	}

	public void test1() {
		System.out.println("This is test1 method");
	}

	public void test2() {
		System.out.println("This is test2 method");
	}

	public void test4() {
		System.out.println("this is test4 method ");
	}
}

public class Day21_InterFace {

	public static void main(String[] args) {
		// exmple is interface and exmple2 is class and we creat object indirectly
		exmple ex = new exmple2();
		ex.test();
		ex.test1();
		ex.test2();

		// direct way to creat an object
		// both work same
		exmple2 ex2 = new exmple2();
		ex2.test();
		ex2.test1();
		ex2.test2();

	}

}
