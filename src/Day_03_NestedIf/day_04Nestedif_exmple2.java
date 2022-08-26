package Day_03_NestedIf;

public class day_04Nestedif_exmple2 {
//main ctrl,space,enter 
	public static void main(String[] args) {
	//if person age less then 18 he can apply for learner 
   //and the age is grater then 18 the nhe can apply for driving license
		//if the age is grater then 21  he can start working 
		//if the age is grater then 65 he is ready to retire
		
		int age =20;
		String name = "john";
		if(age<18) {
			System.out.println(name + "can apply for learner permit");
		}else {
			System.out.println(name+"is grater then age 18 he apply for driving license ");
		if(age<21) {
			System.out.println(name+"is less then 21 you are not ready to work ");
		}else {
			System.out.println(name+"is grater then 21 you can start working ");
			if(age<65) {
				System.out.println(name+"can continue to work ");
			}else {
				System.out.println(name+"ready to retire "); 
				
			}
		}
		}
		
		
		// if she is work more then 25 year in school she elegible benefits
		// if she  work more then 50 years she can  elegible for rerirement 
		//if she  work less then 5 years she is subtittue
		//if she  work more then 5 years she become teacher
		
		int age1 = 24;
		String name1="janny";
		if(age1>25) {
			System.out.println(name1+ "she can elegible for beneits");
		}else {
			System.out.println(name1+"she is not eligibal for benefits ");
			if(age1>50) {
				System.out.println(name1+"she is eligibale to retirments ");
			}else {
				System.out.println(name1+"she is not eligibale to retirments ");
				if(age1<5) {
					System.out.println(name1+"she can be a substitus");
				}else {
					System.out.println(name1+"she is can not be substitus");
					if(age1>5) {
						System.out.println(name1+"she can work as teacher "); 
					}else {
						System.out.println(name1+"she can not work as teacher");
					}
				}
			}
			}
		//i am 30 year old and 
		//i become dr at age of 25
		//if i work more then 10 year i will become a senior dr 
		//if i work less 8 year i am not eligible for any benefits 
		
		int age2 = 24;
		String name2 = "zahara";
		if(age2>30) {
			System.out.println(name2+"  is now 30 year old");
		}else {
			System.out.println(name2+" she is not 30 year old");
		if(age2<25) {
		 System.out.println(name2+" is become a dr age of 25");
		}else {
			System.out.println(name2+"she is not dr yet ");
		if(age2<10) {
			System.out.println(name2+" work more then 10 year so age is now senior dr"); 
		}else {
			System.out.println(name2+" didn't work more then 10 year ");
		if(age2>8) {
			System.out.println(name2+" work more then 8 years as doctor so she is eligible for benefits ");
		}else {
			System.out.println(name2+" work less then 8 year as doctor so she is not eligible for benefits "); 
		}
		
		}
		}
		}
	}
}
		
		
		
		
			
	


