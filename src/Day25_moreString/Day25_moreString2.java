package Day25_moreString;

public class Day25_moreString2 {

	public static void main(String[] args) {
		String name = "Hello World";
		char[] characters = name.toCharArray();
		System.out.println(characters.length);
		
		for(int i=0;i<characters.length;i++) {
			System.out.println(characters[i]);//this is characters of array it will break sentence in characters
		}
		
		String sentence = "today we are learning more string";
		String[] words = sentence.split(" ");//{'today','we','are'}that how it stor in back
		for(int i =0;i<words.length;i++) {
			System.out.println(words[i]);//characters of array
			
		
		}
		
		char[] more = sentence.toCharArray();
		System.out.println(more.length);
		
		for(int i =0;i<more.length;i++) {
			System.out.println(more[i]);
		}
		
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			char[]characs =word.toCharArray();
			for(int j =0;j<characs.length;j++) {
				System.out.println(characs[j]);
			}
			
			System.out.println("************************"); 
		}
			
		
	}		 
	
}
	

