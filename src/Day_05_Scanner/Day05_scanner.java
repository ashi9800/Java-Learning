package Day_05_Scanner;

import java.util.Scanner;

public class Day05_scanner {

	public static void main(String[] args) {

		Scanner takeInput = new Scanner(System.in);

		System.out.println("enter the int value :");
		int val1 = takeInput.nextInt();
		System.out.println("the enterdd value is : " + val1);

		// nextBoolean (true,false)
		System.out.println("It is raining outside ");
		boolean val2 = takeInput.nextBoolean();
		System.out.println("if it is true then it is raining ,if it is not raining then it false :" + val2);

		// nextline string
		System.out.println("enter your name :");
		String name = takeInput.next();
		System.out.println("the name you enterrd is :" + name);

		// nextline byte
		System.out.println("the byte value is :");
		byte val3 = takeInput.nextByte();
		System.out.println("the byte value you enterrd is :" + val3);

		// next double
		System.out.println("enter double value :");
		double val4 = takeInput.nextDouble();
		System.out.println("the double  value you enterrd is : " + val4);

		//// nextfloat
		System.out.println("enter the float value");
		float val5 = takeInput.nextFloat();
		System.out.println("the float valur you enter is " + val5);

		// nextlong
		System.out.println("enter the long value :");
		long val6 = takeInput.nextLong();
		System.out.println("you enterrd long value is :" + val6);

		// nextshort
		System.out.println("enter the short value :");
		short val7 = takeInput.nextShort();
		System.out.println("you enter short value is :");

		System.out.println("print the true value in here :");
		int val8 = takeInput.nextInt();

		int aa = 10;
		int bb = 20;
		if (aa > bb) {
			System.out.println("the value is true ");
		} else {
			System.out.println("the value is falue");
		}

	}

}
