package Day22_Encapsulation;

//Create an abstract class 'Bank' with an abstract method 'getBalance'. 
//$100, $150 and $200 are deposited in banks A, B and C respectively.
//'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.
//Call this method by creating an object of each of the three classes.

abstract class Bank {
	
	abstract void getBalance();
	
	
}

class BankA extends Bank {

	
	void getBalance() {	
		System.out.println("deposite 100");
	}	
}
class BankB extends Bank{

	
	void getBalance() {
		System.out.println("deposite 150");
	}	
}

class BankC extends Bank{

	void getBalance() {
		System.out.println("deposite 200");
	}	
}
public class Day22_task_ {
	public static void main(String[] args) {
		Bank a = new BankA();
		a.getBalance();
		Bank b = new BankA();
		b.getBalance();
		Bank c = new BankA();
		c.getBalance();
	}

}
