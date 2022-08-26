package Day13_Access_Modifire_packageone;

class classfour {
	public int a4 = 50;
	private int b3 = 80;
}

public class ClassTwo {
	public int a2 = 20;

	public static void main(String[] args) {
		ClassOne c2 = new ClassOne();
		c2.methodseven();
		System.out.println(c2.c1);
		// c2.methodfour();//this method is not accessible bcoz it is private
		// System.out.println(c2.b1);//this variable is not accessible bcoz it is
		// private

		c2.methodone();
		System.out.println(c2.a1);
	}

	public static void methodtwo() {
		System.out.println("this is method 2 ");
	}
	
	

}
