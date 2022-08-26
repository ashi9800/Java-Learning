package Day22_Encapsulation;
//We have to calculate the percentage of marks obtained in three subjects 
//(each out of 100) by student A and in four subjects 
//(each out of 100) by student B.
//Create an abstract class 'Marks' with an abstract method 'getPercentage'. 
//It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. 
//The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B.
//Create an object for each of the two classes and print the percentage of marks for both the students.

abstract class marks{
	abstract int getpercentage();
}

class studentA extends marks{
	int biology;
	int math;
	int physics;
	
	studentA(int biology, int math, int physics){
		this.biology = biology;
		this.math = math;
		this.physics = physics;
	}

	
	int getpercentage() {
		int percentage = ((biology + math + physics) / 3 );
		return percentage;
		
	}
}

class StudentB extends marks {
	int biology;
	int math;
	int physics;
	int chemistry;

	StudentB(int biology, int math, int physics, int chemistry) {
		this.biology = biology;
		this.math = math;
		this.physics = physics;
		this.chemistry = chemistry;
	}

	int getpercentage() {
		int percentage =  ((biology + math + physics + chemistry) / 4 );
		return percentage;
		
	}	
}


public class Day22_task3 {

	public static void main(String[] args) {
		studentA a = new studentA(80, 90, 90);
		System.out.println(a. getpercentage() + "%");
		
		StudentB b = new StudentB(75, 80, 90, 75);
		System.out.println(b. getpercentage() + "%");
	}

}
