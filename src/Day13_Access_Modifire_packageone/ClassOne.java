package Day13_Access_Modifire_packageone;

import Day13_Access_Modifire_packagetwo.ClassThree;

public class ClassOne {
	public int a1 = 10;
	private int b1 = 20;
	int c1 = 90;

	public static void main(String[] args) {
		ClassOne c1 = new ClassOne();
		c1.methodone();
		System.out.println("stop=0");

		c1.methodseven();
		System.out.println(c1.c1);

		c1.methodfour();
		System.out.println("Stop=1");

		classfive c4 = new classfive();
		
		//System.out.println(c4.a4);//this is private mthod 
		
		System.out.println("stop =2");

		ClassThree c3 = new ClassThree();
		c3.methodthree();
		System.out.println(c3.a3);
		// c3.methodeight(); //is not accessible bcoz it is present in diffrent package
		// System.out.println(c3.c3);//this variable id not accessible bcoz it is in
		// diffrent packge
		// private exmple
		c1.methodfour();
		System.out.println(c1.b1);

		classfive c5 = new classfive();
		// System.out.println(c5.b4);//variable is not accessible bcoz it private

		ClassThree c6 = new ClassThree();
		// c3.methodfive(); //bcoz the method is private
		// System.out.println(c6.b3);//bcoz the varible is private
	}

	public static void methodone() {
		System.out.println("this is method 1");
	}

	private static void methodfour() {
		System.out.println("this is method 4 ");
	}

	static void methodseven() {
		System.out.println("this is metod seven");
	}

}
