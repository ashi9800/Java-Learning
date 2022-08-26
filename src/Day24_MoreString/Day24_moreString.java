package Day24_MoreString;

public class Day24_moreString {

	public static void main(String[] args) {
		String lname = "ashi";
		String fname = "vahora ";
		String fullname = fname.concat(lname);//this method will work like "+"
		System.out.println(fullname);
		
		String Day = "   today we are learing more string   ";//i leave some space it only trim space not character
		System.out.println("before using trim :"+Day);
		Day = Day.trim();
		System.out.println("after using trim :"+Day);
		
		if(Day.equals("today we are learing more string")) {
			System.out.println("yayy the string value match ");
		}else {
			System.out.println("the value does not match");
		}
		
		String transaction ="$50.00";
		boolean dollarsymbol = transaction.startsWith("$");
		
		if(dollarsymbol) {
			System.out.println("the prefix is present");
		}else {
			System.out.println("the prefix is not present");
		}
		
		boolean stringPresent = Day.endsWith("string");// it is checking end value of day and it ending with string so it will print true 
		System.out.println(stringPresent);//true
		
		char ret = transaction.charAt(0);//in charAt we have to provide a index value like what is in 0 index or 1 index in transaction 
		System.out.println(ret);
		
		System.out.println(transaction.indexOf('5'));//in indexof it will give us value of what is in index 3 or 5 of $50.000;
		String email = "helllo123@gmail.com";
		System.out.println(email.indexOf('@'));
		
		System.out.println(email.substring(9));// this will print index 9 after all text //i give 9 bcoz in line 39 i know the @ index
		System.out.println(email.substring(0, 9));//here we have to give starting index and ending index
		String title = "welcome to the car dealer$hip";
		System.out.println(title);
		title = title.replace("$"," s");//we give oldchar which is "$ "and  we give newchar so it will replace to whatever character will provide 
		System.out.println(title);
	}

}
