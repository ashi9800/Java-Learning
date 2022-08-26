package Day_05_Scanner;

import java.util.Scanner;

public class day_04_scanner_class {

	public static void main(String[] args) {
		
		//creat object /intance of the class 
		//classname objectname =new classname;
		
		Scanner getInput = new Scanner(System.in);
		//getInput is object of scanner class 
		
		System.out.println("enter the first value");
		//scanner class has method which takes the int value as input 
		
		int aa = getInput.nextInt();
		System.out.println("enter the second value");
		
		int bb = getInput.nextInt(); 
		System.out.println("enter the third value");
		
		int cc =getInput.nextInt();
		int dd = aa-bb-cc;
		System.out.println("the value is "+(dd));
		
	}

}
