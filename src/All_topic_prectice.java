import java.util.Scanner;

public class All_topic_prectice {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		if(a==10) {
			System.out.println("10 is equal to 10");
		}else {
			System.out.println("10 is not equal to 10");
		}if(b>10) {
			System.out.println("20 is greater then 10");
		}else {
			System.out.println("20 is not greater then 10");
		}
		
		String name = "london";
	    switch (name) {
	    case "london":
	    	System.out.println("this is london");
	    	break;
	    case "united":
	    	System.out.println("this is united");
	    	break;
	    }
	    // i am trying to do array sum with using scanner
	    //without using operator code
	    Scanner getinput = new Scanner(System.in);
	    System.out.println("enter the first value");
	    int a1 = getinput.nextInt();
		System.out.println("enter second value");
		int a2 = getinput.nextInt();
		System.out.println("enter third value");
		int a3 = getinput.nextInt();	
		int[][][] tottle = new int[a3][a2][a1];
		int sum = 10;
		for(int i = 0; i<tottle.length;i++)
			//sum = sum +tottle[i];
		System.out.println("the sum is :"+sum);
		

		
			}

}
