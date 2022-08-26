package Day_05_Scanner;

import java.util.Scanner;

public class Day_05_ifelse_using_scanner {

	public static void main(String[] args) {
		
		
		
		
		Scanner getinput = new Scanner (System.in);
		System.out.println("enter 1st month ");
		String month1 = getinput.next();
		if(month1=="jan") {
			System.out.println("frist month");
		}else {
			System.out.println(" wrong month");
		}
		
		System.out.println("enter 2st month ");
		String month2 = getinput.next();
		 if (month2=="feb") {
				System.out.println("second month of the year");
		 }else {
				System.out.println(" wrong month");
			}
		System.out.println("enter 3st month ");
		String month3 = getinput.next();
		if(month3=="march") {
			System.out.println("third month of the year");
		}else {
			System.out.println(" wrong month");
		}
		
		System.out.println("enter 4st month ");
		String month4 = getinput.next();
		if(month4=="april") {
			System.out.println("four month of the year");
		}else {
			System.out.println(" wrong month");
		}
				
		
	}
		 
		 
}

