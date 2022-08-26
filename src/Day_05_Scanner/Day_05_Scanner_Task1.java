package Day_05_Scanner;

import java.util.Scanner;

public class Day_05_Scanner_Task1 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Enter the first value");
	int a = input.nextInt();
	System.out.println("Enter the second value");
	int b = input.nextInt();
	System.out.println("select the operation ");
	char op = input.next().charAt(0);
	
	if(op=='+') {
		System.out.println(a+b);
	}else if(op=='/') {
		System.out.println(a/b);
	}else {
		System.out.println("invalid value");
	}		
	}
}
