package Day26_MoreString;

public class Day26_more_String {

	public static void main(String[] args) {
		//string we can't modify
		String a = "Hello ";
		String b = a+"world";
		System.out.println(b); 
		
		//append work like overriding 
		//using same variable we can add N number or words , int value all type of value and it will not hold space at the back
		//we can keep on adding so many value 
		//stringbuffer we can modifiy 
		StringBuffer aa = new StringBuffer("Hello");
		aa.append("world");
		aa.append("today we are learing String Buffer");
		System.out.println(aa);
		
		//we have insert method  we can add any characters in between existing value or new value by using instrest 
		//it can be string value or space or . aything 
		//so here i give first characters of string number and then in second it asking mw what i whould i like to add
		aa.insert(5, ' ');
		System.out.println(aa); 
		aa.insert(11, '.');
		System.out.println(aa); 
		aa.insert(0, "Good Everning.");
		System.out.println(aa);
		
		//this reverse will print reverse value 
		aa.reverse();
		System.out.println(aa); 
		
		//using again reverse  it will reverse back again 
		aa.reverse();
		System.out.println(aa);
		
		//delete method will delete text by giving a index number
		// by giving index value i want to delete  good evening and as i can in console it dealte 
		aa.delete(0, 14);
		System.out.println(aa);
		
		//this deletecharat will delete one specific index 
		//i want to delete a . and we cna see on console it delete the .
		aa.deleteCharAt(11);
		System.out.println(aa);
		
		//so replace i can give starting index and ending index and give the text you want replce 
		aa.replace(6, 11, "people ");
		System.out.println(aa); 

	}

}
