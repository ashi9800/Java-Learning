package Day27_Try_and_Catch;

import java.util.Scanner;

public class Day27Try_and_catch {

	public static void main(String[] args) {
		System.out.println("program started");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter the value of a");
			int a = sc.nextInt();
			System.out.println("the value of a : "+a);
			System.out.println("enter the value of b");
			int b = sc.nextInt();
			System.out.println("the value of b :"+b);
			int c = a/b;
			System.out.println("the divisoon of c :"+c);	
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		

	}

}
