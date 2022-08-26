package Day15_global_local_variable;

public class Day15_globle_varible {
//globle varible
	String phone = "Iphone";
	String color = "k";
	static int memory = 32;
	
	public static void main(String[] args) {
		Day15_globle_varible jhonePhone = new Day15_globle_varible();
		System.out.println(jhonePhone.phone);
        System.out.println(jhonePhone.color);
        System.out.println(jhonePhone.memory);//32
        
        Day15_globle_varible stevePhone = new Day15_globle_varible();
        stevePhone.phone = "Iphone13";
        stevePhone.color = "blue";
        stevePhone.phone = "red";//if i change the value here it will update the value of first jhone phone and change with red 
        stevePhone.memory = 64;
        
        System.out.println(stevePhone.phone);
        System.out.println(stevePhone.color);
        System.out.println(stevePhone.memory);//64 it will update the value globally if you use static 
        
        Day15_globle_varible mikePhone = new Day15_globle_varible();
        System.out.println(mikePhone.phone);//it will print globle value bcoz i didn't change the value for mike 
        System.out.println(mikePhone.color);// it will print globlae value
        System.out.println(mikePhone.memory);//64
        
        Day15_globle_varible vinphone = new  Day15_globle_varible();
        vinphone.possible1();
	}
	
	public static void possible1() {
		 Day15_globle_varible vinphone = new  Day15_globle_varible();
		 vinphone.phone = "Iphone12";
		 vinphone.color = "pink";
		 System.out.println(vinphone.phone);//iphone
		 System.out.println(vinphone.color);//black
		 System.out.println(vinphone.memory);//64 
	}
	
}
