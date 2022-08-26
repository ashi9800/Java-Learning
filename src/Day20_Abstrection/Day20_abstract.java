package Day20_Abstrection;
abstract class Furniture{
abstract void color();//abstract method 
abstract void material();
abstract void weight();
}
//abstract doesn't have body so when you extend it will ask for body
//watch video
abstract class chair extends Furniture {
	void color() {
		System.out.println("This is color method");
	}

	void weight() {
		System.out.println("this is weight method ");
	}

	abstract void dimenstion();
}
class brand extends chair {
	void dimenstion() {
		System.out.println("this is dimenstion method ");
	}

	void material() {
		System.out.println("this is material method");
	}
	
}

public class Day20_abstract {

	public static void main(String[] args) {
		//we are creating a direct object
		brand b = new brand();
		b.color();
		b.dimenstion();
		b.material();
		b.weight();
		
	}

}
