package Day_03_NestedIf;

public class day03_NestedIf {

	public static void main(String[] args) {
		//VP 200,000Sr/Jr,IT_PROG 120000,analyst 80000
		String title = "devloper ";
		String  role = "junior ";
		if(title=="vp") {
			System.out.println("vice president ");
			if(role=="junior") {
				System.out.println("salary is 200,000");
				}else if (role=="senior") {
					System.out.println("salary is 250,000");
				}else {
					System.out.println("the role doesn't exist");
				}
			}else if (title=="IT_PROG") {
				System.out.println("IT_programer");
				//there are not condtion for role 
				if (role=="junior") {
					System.out.println("the salary is 120,000");
				}else if (role =="junior") {
					System.out.println("saalry is 170,000");
				}else {
					System.out.println("the role doesn't exist");
				}
				
				}else if (title=="ANALYST") {
					System.out.println("system analyst");
				if(role =="junior") {
					System.out.println("salary is 80,000");
				}else if (role=="senior") {
					System.out.println("salary is 130,000"); 
				}else {
					System.out.println("the role doesn't exist ");
				}
								
				}else {
					System.out.println("the role doesn't exist"); 
				}

	}

}
