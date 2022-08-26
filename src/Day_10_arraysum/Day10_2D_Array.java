package Day_10_arraysum;

public class Day10_2D_Array {

	public static void main(String[] args) {
   String[][] countries = new String[2][2];
   countries [0][0] = "usa";
   countries [0][1] = "london";
   countries [1][0] = "paris";
   countries [1][1] = "canada";
   
   //System.out.println(countries [0][1]);
//	System.out.println(countries[1][1]);	
	 
	//string countries = {"usa","london","paros","canada"}
	String[][] _countries  = {{"usa","london","zimba" },
	                         { "paris","canada","bangladesh"},
	                         {"bali","africa","kanya"}, 
	                         {"india","pakistan","saudi"}
	                         };
      // System.out.println(_countries[3][0]);
       
       for(int rows =0; rows< _countries.length;rows++) {
    	  for (int column =0;column< _countries[rows].length;column++){
    		  
    		  //it will read first rows then column 
    		 //  System.out.println(_countries[rows][column]);
    	   }
       }
	
       
       
       
		int[][] number = new int[2][4];
		//[0][1] = [0] row ,[1] coloum 
		    //rom //coloum
		number [0][0] = 1;
		number [0][1] = 2;
		number [0][2]=  3;
		number [1][0] = 4;
		number [1][1]=  5;
		
		
		System.out.println(number.length);
	
		//System.out.println(number[0][2]);
		
	for(int row =0; row<number.length;row++) {
    for(int column =0;column <number[row].length;column++) {
   System.out.println(number[row][column]);
    }
	}
	
		
	//@here Task for monday
	// Write a program which asks user that how many values they want to do a sum for?
			// lets say user enters 5
			// it should ask user to enter those 5 values
			// once the user enters those 5 values it should print the sum of those 5 values
			// Scanner, One dimensional Array, for loop
	}

}
