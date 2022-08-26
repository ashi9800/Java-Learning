package Day22_Encapsulation;

public class Day22_Encapsulation_Employees_informatrion {

	private String name;
	private int ssn;
	private boolean graduted;

	Day22_Encapsulation_Employees_informatrion(String name, int ssn, boolean graduted) {
		this.name = name;
		this.ssn = ssn;
		this.graduted = graduted;
	}

//set will alwyes be with void 
//another way to setter the value by using constructor 
//but when you use constructor you will still keep the getter code but we don't need setter
	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public int getSsn() {
		return ssn;
	}

//	public void setSsn(int ssn) {
//		this.ssn = ssn;
//	}

//	public void setGraduted(boolean graduted) {
//		this.graduted = graduted;
//	}

	public boolean getGraduted() {
		return graduted;
	}

}
