package Day_07_loops;

import java.util.Scanner;

public class Day_05_loop_homework {

	public static void main(String[] args) {
		
		//let user input month they were born and based on that ,
		//tell if there were born in winter ,summer,spring,fall
		//make your program run three time 
		//jan-mar winter 
		//apr-jun spring 
		//jul -sep summer 
		//sep dec  fall
		//three thing to do scanner /if else /or switch/for loop 
		//for (i=o;i<=2;i++)
		
		for(int i =0;i<=3;i++) {
		System.out.println("what is month you born");	
		Scanner input = new Scanner (System.in);
		String month = input.next();
		
		//equalsignorecase work as ignore uppercase or lowercase so it will work as not case sensitive
		
		if(month.equalsIgnoreCase("jan")||month.equals("feb")||month.equals("march")){
			System.out.println("winter");
			}else if(month.equals("april")||month.equals("may")||month.equals("june")){
				System.out.println("spring");
			}else if(month.equals("july")||month.equals("aug")||month.equals("sep")){
				System.out.println("summer");
			}else if (month.equals("oct")||month.equals("nov")||month.equals("dec")) {
				System.out.println("fall");
			}else {
				System.out.println("no month exist");
			}
		}
	}

}
