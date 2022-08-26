package Day_10_arraysum;

public class Day_10_arraysum {

	public static void main(String[] args) {
		
		int[]numbers = {2,3,5,4,6,7};
		//when we inisilize this value inside for loop it will not give us sum of tottle 
		int sum =0;
		
		//condition will run until it get false s0 0<2 is true then 1<3 is true 2<5 is true 
		for(int a=0;a<numbers.length;a++) {
		sum = sum +numbers[a];
		}
      System.out.println("the sum is :"+sum);
     
  
	}
     
     
}


     
     
     
     
     
     
     
     
     
     
     
     
     
	


