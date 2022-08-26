package Day17_Hierarchical_inheritance;

public class Samsung extends Phone {
//hirerarchichal child class 

	public static void main(String[] args) {
		Samsung mob2 = new Samsung();
		mob2.imei = 44444;
		mob2.color = "black";
		mob2.camara = "80";
		mob2.make = "samsung";
		mob2.makecalls();
	}

}
