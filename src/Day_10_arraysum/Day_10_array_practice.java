package Day_10_arraysum;

import java.util.Scanner;

public class Day_10_array_practice {

	public static void main(String[] args) {
		
		//@here Task for monday
		// Write a program which asks user that how many values they want to do a sum for?
				// lets say user enters 5
				// it should ask user to enter those 5 values
				// once the user enters those 5 values it should print the sum of those 5 values
				// Scanner, One dimensional Array, for loop
		
		Scanner getinput = new Scanner (System.in);
		System.out.println("how many values do you want to sum for :");
	    int values = getinput.nextInt();
	    int[] arr = new int [values];
	    int sum =0;
	    
	    for(int a =0; a<arr.length;a++) {
	    	System.out.println("Enter the" + (a+1) +" value :");
	    	//we use arr bcoz it inside arr 
	    	 arr[a] = getinput.nextInt();
	    	 sum = sum +arr[a];
	    }
	   System.out.println("the sum of"+arr.length+"values is :"+sum);
	  
		
	}
}