package Day_04_switch;

public class day_04_switch_statments {

	public static void main(String[] args) {

		// without break it will start printing value once the true statments comes and
		// it will print all value
		// after true statements even it is false
		// so when you use break it will stop printing once the true statments comes

		String day = "monday";
		switch (day) {
		case "monday":
			System.out.println("1st day of the week");
			break;
		case "tuesday":
			System.out.println("2st day of the week ");
			break;
		case "wednesday":
			System.out.println("3th day of the week ");
			break;
		case "thusday":
			System.out.println("4th day of the week ");
			break;
		case "friday":
			System.out.println("5th day of the week ");
			break;
		case "saturday":
			System.out.println("6th day of the week ");
			break;
		case "sunday":
			System.out.println("7th day of the week ");
			break;

		}

		int age = 3;
		switch (age) {
		case 1:
			System.out.println("the value is 1");
			break;
		case 2:
			System.out.println("the value is 2");
			break;
		case 3:
			System.out.println("the value is 3");
			break;
		case 4:
			System.out.println("the value is 4");
			break;

		}
		char abc = 'b';
		switch (abc) {
		case 'a':
			System.out.println(" first letter is a ");
			break;
		case 'b':
			System.out.println("second letter  is b ");
			break;
		case 'c':
			System.out.println("thired letter  is c ");
			break;
		case 'd':
			System.out.println("four letter  is d");
			break;
		default:
			System.out.println("the latter is not exist ");

		}

		int number = 2;
		switch (number) {
		case 1:
			System.out.println("the number is 1");
			break;
		case 2:
			System.out.println("the number is 2");
			break;
		default:
			System.out.println("the number is not exist");
		}
		
		String mobile = "black mobile";
		switch (mobile) {
		case "white mobile":
			System.out.println("the mobile is white");
			break;
		case "blue mobile ":
		System.out.println("the mobile is blue ");
		break;
		}
		
		
		
		
		
		
		
		
		
			}
	
	
			
		}
		
		
	
		

	


