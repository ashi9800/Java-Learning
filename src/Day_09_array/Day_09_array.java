package Day_09_array;

public class Day_09_array {

	public static void main(String[] args) {
		//int[] rollnumber //declare an array variable 
		//rollnumber = new rollnumber[5];
		int[] _rollnumber = new int[5]; //_ this sign seprete thw rollnumber 
		_rollnumber [0] = 500;
		_rollnumber [1] = 300;
		_rollnumber [2] = 200;
		_rollnumber [3] = 100;
		_rollnumber [4] = 600;
		System.out.println(_rollnumber[4]);
		
		//creat array of string and store student name in different index
		String[]_studentname = new String[4];
		_studentname[0] = "ashi";
		_studentname[1] = "hassan";
		_studentname[2] = "abdullah";
		_studentname[3] = "rahil";
		System.out.println(_studentname[0]);
		
		int[] rollnum = {100,200,400,500,600,700};
		System.out.println(rollnum[2]);
	
		String[] sisname = {"ashi","yasar","mom","dad","karishma"};
		System.out.println(sisname[3]);
		
		//System.out.println(sisname.length); it method to get length 
		
		for(int i=0;i<sisname.length;i++) {
			System.out.println(sisname[i]);
		}
		
		
		int[] booksnumber = {1,45,2,6,4,6,3,6,8,5,3,7,8,5,3,5,9};
		for(int p=0;p<booksnumber.length;p++) {
			System.out.println(booksnumber[p]);
		}
		
		
		char[] ashi = {'t','r','w','t','d','v'};
		for(int p = 0;p<ashi.length;p++) {
			System.out.println(ashi[p]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
