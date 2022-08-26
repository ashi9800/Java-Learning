package prectice;

public class prectice_constrectorchildclass extends  prectice_constrector{
int d = 500;
	public static void main(String[] args) {
		//i have to make object of class of each method in order to call them by different parameterized 
		prectice_constrector a = new prectice_constrector();
		prectice_constrector b = new prectice_constrector(10);
		
		prectice_constrectorchildclass  abc = new prectice_constrectorchildclass ();
		System.out.println(abc.c);
		System.out.println(abc.d);
		abc.hello();
		String w = Day1();
		System.out.println(w);
		
		 String y = name3("Ashiyana","vahora");
		 System.out.println(y);
		
		 System.out.println(abc.man);
		 System.out.println(abc.height);
		 
		 prectice_constrectorchildclass cy = new prectice_constrectorchildclass();
		 cy.hair = "pink";
		 cy.height = 9;
		 System.out.println(cy.hair);
		 System.out.println(cy.height);
		 System.out.println(cy.man);//it will print white man bcoz i didn't change the value of man 
		 
		 
	}

}
