package Day26_MoreString;

public class Day26_task {

		public static void main(String[] args) {
			
			//1.Create a method that will take 1 String sentence as a parameter. Inside your method write a code that should return a String without any spaces.

			System.out.println(noSpaceSentence("Create a method that will take 1 String sentence as a parameter. Inside your method write a code that should return a String without any spaces."));
			System.out.println(returnNumberOfCharacters("1234567890ahbjshdjsdbASYFEUYUWE^%$#@$%!"));
			String a = "Today is a good day. It is Thursday. We have a Java Class. How would you find out how many sentences are in that String?";
			String[] sen = a.split("\\.");
			System.out.println(sen.length);
		}
		
		//2.Create a method that will take 1 String as parameter (your String should be combination of letters, numbers and special characters). Inside your method write a logic that will calculate the number of special characters only and your method should return that number.

		public static String noSpaceSentence(String sentence) {
			return sentence.replaceAll(" ", "");
		}
		
		//3.You have a String a="Today is a good day. It is Thursday. We have a Java Class". How would you find out how many sentences are in that String?

		public static int returnNumberOfCharacters(String words) {
			String specialCharacters = words.replaceAll("[A-Za-z0-9]", "");
			int specialCharacterCount = specialCharacters.length();
			return specialCharacterCount;
		}

	}


