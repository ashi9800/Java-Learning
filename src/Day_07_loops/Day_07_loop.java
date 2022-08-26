package Day_07_loops;

import java.util.Scanner;

public class Day_07_loop {

	public static void main(String[] args) {
		System.out.println("before the loop");
		for(int i=0;i<=10;i++) {
			System.out.println("hello world");
		}
       System.out.println("after the loop");
       
       for (int i =10;i>=0;i--) {
    	System.out.println(i);   
    	
    	//print number from 1 to 100
    	System.out.println("before the incriment ");
    	for(int q =1;q<=100;q++) {
    		System.out.println(q);
    	}
    	System.out.println("after the increment");
    	
    	//print number from 100 to 1
    	System.out.println("before the decrement");
    	for(int p=100;p>=1;p--) {
    		System.out.println(p);
    	}
    	
    	System.out.println("after the decrement");
    	
    	//print even number 20 and 50 beki 
    	//so for even number the remender is 0 so 20%2 = 0
    	System.out.println("before even number");
    	for(int r=20;r<=50; r++ ) {
    		if(r%2==0) {
    			System.out.println(r);
    			}
    		//print odd number 20 and 50 aeki 
    		//20%21=1 so odd number could be 21,23,25,27
    		System.out.println("before odd number");
    		for(int p =20;p<=50;p++) {
    			if(p%2==1) {
    				System.out.println(p);
    			}
    		}
    	}
       } 
	}
}