package Day20_Abstrection;
 abstract class house {
	abstract void house1();
	abstract void housee2();
	abstract void house3();
}
  abstract class street extends house {

//i only add two method bcoz i don't know what to write on third method house3
//when i hoverover to the street bcoz i get error it said make abstract method or add unimpliment method 
	  //abstract has only abstract method ,abstract define method 
	void house1() {
			System.out.println("this is house 1");
	}

	void housee2() {
			System.out.println("this is house 2");
	}
	
	 abstract void house5();
 }

  class scocity extends street{
	//so i get error to scocity and it said add unimpliments method

	void house5() {
		System.out.println("this is house 5");
			
	}

	void house3() {
		System.out.println("this is house 3");	
	}
	  
  }
public class Abstract_task {

	public static void main(String[] args) {
		//it did give me error before bcoz we cannot make object of abstract class 
		//i make object of scocity method bcoz we can't make abstract class as object 
		//but if we want to call abstract mwthod we can called them indirectlity
		scocity e = new scocity();
		e.house1();
		e.housee2();
		e.house3();
		e.house5();
	}

}
