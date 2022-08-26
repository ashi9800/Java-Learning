package Day19_this_super_keyword;

public class Day19_This_Keyword {
	int rollnum;
	String name;
	float fee;

	//in constructor we make obj of class same as class name 
	//this keyword is passing the value to instance variable
	//this keyword we use when we have same name as instant variable then we use this
	
	 Day19_This_Keyword(){
		 System.out.println("Heloo this is default constructor");
	 }
	 Day19_This_Keyword(int rollnum){
		 //this(); will print the default method on line number 13
		 this();
		 System.out.println("Heloo this is default constructor"+rollnum);
	 }
	Day19_This_Keyword(int rollnum,String name , float fee){
		//this ();it can be use invoke currant class constructor 
		//this(3333);will pass the value in line number 15 and it will pass on line number 18 and it will with 3333
		this(333333);
		this.rollnum = rollnum;
		this.name = name;
		this.fee = fee;
	}
	void displayData() {
		System.out.println("Roll num :"+rollnum);
		System.out.println("Name :"+name);
		System.out.println("fee :"+fee);
	}
}
