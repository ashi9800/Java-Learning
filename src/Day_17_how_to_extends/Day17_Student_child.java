package Day_17_how_to_extends;

public class Day17_Student_child extends Day17_facultyparant {
int bonus = 2000;
	public static void main(String[] args) {
		//since you are using inheritance or extend the parent class you already have access of parent class 
		//so in order to print value from child class we need to make object of childclass 
		Day17_Student_child a = new Day17_Student_child();
		System.out.println(a.salary);
		System.out.println(a.bonus);
	}

}
