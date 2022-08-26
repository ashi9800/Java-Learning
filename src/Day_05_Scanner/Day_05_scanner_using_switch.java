package Day_05_Scanner;

import java.util.Scanner;

public class Day_05_scanner_using_switch {

	public static void main(String[] args) {

	Scanner getinput= new Scanner(System.in);
	System.out.println("get the first house ");
   String house = getinput.next();
  
  switch(house) {
  case "house":
	  System.out.println("first house in street");
	  break;
  case"house2":
	  System.out.println("second house of the street");
	  break;
  case"house3":
	  System.out.println("third house of the street");
	  break;
  case"house4":
	  System.out.println("four house of the street");
	  break;
  case"house5":
	  System.out.println("five house of the street");
	  break;
	    default:
		  System.out.println("there is no street ");	  
  }
  
  
 
		 }
	  
  } 

	
