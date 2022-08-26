package Day_02_ifCondition;

public class Day03_IfCondition {

	public static void main(String[] args) {
		// true statements
		// it will executing only when condition is true
		if (2 == 2) {
			System.out.println("the value is 2");
		}
		System.out.println("after the if statement ");
		// false statement
		// it will not executing bcoz condition is false
		if (2 == 3) {
			System.out.println("the value is not 2");
		}
		int a = 30;
		if (a == 33) {
			System.out.println("value of a is 30");
		} else {
			System.out.println("value of a not 30");
		}
		// Compare 2 double value using if else statements .
		double b = 10.506767585;
		double c = 12.566757843;
		if (b == c) {
			System.out.println("the value of b is 10.50");
		} else {
			System.out.println("the value of b is not 10.50");
		}
		// check if the number is positive or negative using if else statments
		int d = 5;
		// any value 0> will be positive
		if (d > 0) {
			System.out.println("the value is positive ");
		} else {
			System.out.println("the value is negative");
		}
		// if else else if statments
		char value = 'a';
		if (value == 'a') {
			System.out.println("the value is a");
		} else if (value == b) {
			System.out.println("the value is b");
		} else if (value == c) {
			System.out.println("the value is c");
		} else {
			System.out.println("the value is somthing else ");
		}
		String day = "monday";
		if (day == "monday") {
			System.out.println("today is monday");
		} else if (day == "tuesday") {
			System.out.println("today os tuesday");
		} else if (day == "wednsday") {
			System.out.println("today is wednsday");
		} else if (day == "thuesday") {
			System.out.println("today is thuesday ");
		} else if (day == "friday") {
			System.out.println("today is friday ");
		} else if (day == "saturday") {
			System.out.println("today is saturday");
		} else if (day == "sunday") {
			System.out.println("today is sunday");
		} else
			System.out.println("today is somthing else");

	}

}
