package Day15_global_local_variable;

public class day15_LocalVaribles {

	public static void main(String[] args) {
		// local varible 
		int age = 10;
		String name ="john";
		float temp = 45.654f;
		
		System.out.println(age);
		System.out.println(name);
		System.out.println(temp);
		
		day15_LocalVaribles a = new day15_LocalVaribles();
		 a.possible();
		if(true) {
			//local varible 
			int b = 40;
			System.out.println(b);
		}	
	}
	public static void possible() {
	//local varible
	String environment = "qa.codegeter.us";
	String username = "test@gmail.com";
	String password = "Welcome1";
	System.out.println(environment);
	System.out.println(username);
	System.out.println(password);
	 
	}
	
	
	
	
	
}
