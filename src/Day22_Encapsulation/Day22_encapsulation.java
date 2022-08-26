package Day22_Encapsulation;

public class Day22_encapsulation {

	public static void main(String[] args) {
		 Day22_Encapsulation_Employees_informatrion a = new Day22_Encapsulation_Employees_informatrion("washington",8765,true);
		 //first we need to set name then it will stor the value in setname then getname will print that set name
		// a.setName("Washington");
		System.out.println(a.getName());
		//a.setSsn(8765);
		System.out.println(a.getSsn());
	//	a.setGraduted(true);
		System.out.println(a.getGraduted());
	}

}
