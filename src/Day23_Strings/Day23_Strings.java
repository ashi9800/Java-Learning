package Day23_Strings;

public class Day23_Strings {

	public static void main(String[] args) {
		String topic = new String("today we are learing new topic");
		int len = topic.length();
		String name = "JHON";
		String lastname = "KING";
		System.out.println(len);
		
		
		System.out.println("this will print the length of name variablr :" +name.length());
		System.out.println("this will print the variable :"+name);//JHON
		String lower = name.toLowerCase();
		System.out.println("this will conver to lowercase :"+lower);//jhon
		
        System.out.println(topic.toUpperCase());//print all in upper case 
        
        System.out.println("using ignorecase : "+name.equalsIgnoreCase(lastname));//boolean
        System.out.println("using equles method :"+name.equals(name));//boolean 
        
        System.out.println(name.compareTo(lastname));
        System.out.println(name.compareToIgnoreCase(lastname));
        
        //task
        String firstname1 = "ashi";
        String lastname1 = "vahora";
        
        int value = firstname1.compareTo(lastname);
        if(value==0) {
        	System.out.println("the value is eques too");
        }else if (value>0) {
        	System.out.println("the value is greter then 0");
        }else if (value<0) {
        	System.out.println("the value is less then 0"); 
        }
	}

}
