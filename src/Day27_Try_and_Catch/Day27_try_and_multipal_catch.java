package Day27_Try_and_Catch;

public class Day27_try_and_multipal_catch {

	public static void main(String[] args) {
	try {
		int a = 6/2;
		System.out.println(a);
		String b ="hello";
		System.out.println("length of :"+b.length());
		
		int[] c = new int[2];
		c[0] = 1;
		c[1] =100;
		c[2]=20;
		System.out.println(c[2]);
	}catch(ArithmeticException e) {
		e.printStackTrace();
	}catch(NullPointerException e) {
		e.printStackTrace();
	}catch(Exception e ) {
		e.printStackTrace();
	}
	}

}
