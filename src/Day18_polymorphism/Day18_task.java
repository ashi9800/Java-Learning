package Day18_polymorphism;
import java.util.Scanner;

public class Day18_task {

	public static void main(String[] args) {
		//ask user that how many values she need to calculate
		//enter value #1 :20
		//enter value #1 :40
		//enter value #1 :30
		//enter the method for exmple +
		//print : the sum of 20 and 40 is 60 
		//first take input from user 
		//scanner,loop,arrays,if else /switch
		
		
			
			Scanner getinput = new Scanner(System.in);
			System.out.println("how many value do you want to sum");
		    int value = getinput.nextInt();
		    int[] a = new int[value];
		    int sum =0;
		    for(int i=0;i<a.length;i++){
		    System.out.println("enter the"+i+1+"value");
		    a[i]=  getinput.nextInt();
		    sum = sum + a[i];
		    
		   }	
	}
	public static void method() {
		System.out.println();
	}
		
	}
	

		


