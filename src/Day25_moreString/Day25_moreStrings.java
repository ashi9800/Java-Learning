package Day25_moreString;

public class Day25_moreStrings {

	public static void main(String[] args) {
		
	String words = "J@1#m%2&O*3(i)4$H!5#k$6&N*7%e#8!";
	String nonumbers = words.replaceAll("[1-9]", "");     //if you do not want to replace with anything then leave it empty
	System.out.println("before replacing number [0-9]" +words);
	System.out.println("after replacing [0-9] "+nonumbers);
	
      String  noUppercase = words.replaceAll("[A-Z]","");
	 System.out.println("after removing [A-Z]character"+ noUppercase);
	 
	 String  nolowercase = words.replaceAll("[a-z]","");
	 System.out.println("after removing [a-z]character"+ nolowercase); 
	 
	 String onlyspecialcharacters  = words.replaceAll("[A-Za-z0-9]","");
	 System.out.println("after removing [A-Z]character"+ onlyspecialcharacters); 
	 
	 String  shownumbersonly = words.replaceAll("[^0-9]","");
	 System.out.println(  shownumbersonly ); 
	 
	 String  uppercaseonly = words.replaceAll("[^A-Z]","");
	 System.out.println(  uppercaseonly ); 
	 
	 String  lowercaseonly = words.replaceAll("[^a-z]","");
	 System.out.println(  lowercaseonly ); 
	 
 }
	}


