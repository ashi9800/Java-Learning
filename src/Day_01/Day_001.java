package Day_01;

public class Day_001 {
//Default value 
	static int b;
	static char c;
	static double e;
	static float g;
	static boolean i;
	static String k;
	public static void main(String[] args) {
		//initializing a variable
		//the variable name is a and the value  is 5
		int a = 5;
		//declared variable b
		System.out.println(a);
		System.out.println(b);
		
		//Initialize a char variable d
		char d = 'p';
		System.out.println(c);
		System.out.println(d);
		
		double f = 10.86878685944885848;
		System.out.println(e);
		System.out.println(f);
		
		float h = 10.8977675453527586875654f;
		System.out.println(g);
		System.out.println(h);
		
		boolean j = true;//default  value is false 
		System.out.println(i);
		System.out.println(j);
		
		String i="Hello";//default null
		System.out.println(k);
		System.out.println(i);
		
		//cencanition 
		String first_name = "Ashiyana";
		String last_name = "gudawala";
		//you can called in multiple way 
		System.out.println(first_name +last_name);
		System.out.println(first_name+' '+last_name);//single '' char one character 
		System.out.println("Ashiyana"+' '+"gudawala");
		
		//Addition
		int value1 =50;
		int value2 =10;
		System.out.println(value1+value2);
		//you can write  in multiple way 
		int sum = value1+value2;
		System.out.println(sum);
		
		//subtraction
		System.out.println(value1-value2);
		int sub = value1 - value2;
        System.out.println(sub);
        
        //division
        System.out.println(value1/value2);
        int div = value1/value2;
        System.out.println(div);
        
        //multiplication
        System.out.println(value1*value2);
        int mul = value1*value2;
        System.out.println(mul);
        
        //mod
        System.out.println(value1%value2);
        int mod =value1%value2;
        System.out.println(mod);
        
        System.out.println("******************************************");
        System.out.println("task ");
        System.out.println("******************************************");
       // Write a Java program to print an int, double and char.
        int aa = 20;
        System.out.println(aa);
        double bb =2.79685574732766545456544;
        System.out.println(bb);
        char cc = 'a';
        System.out.println(cc);
        
        //Write a program to add an integer variable having value 5 and a double variable having value 6.2.
        int dd = 5;
        double ee = 6.2;
        System.out.println(dd+ee);
       // Write a program to find the square of the number 3.9.
        double ff = 3.9;
        System.out.println(ff*ff);
       // Write a program to print the area of a rectangle of sides 2 and 3.
      int gg = 2;
      int hh=3;
      int total = gg*hh;//second way to write 
      System.out.println((hh*gg));
      System.out.println(total);
      System.out.println("******************************************");
      System.out.println("operatores");
      System.out.println("******************************************");
      
      int ii = 500;
      int jj = 600;
      System.out.println(500==600);//f
      System.out.println(ii==jj);//f
      
      boolean kk = ii==jj;//f
      System.out.println(kk);
      
      System.out.println(ii!=jj);
      boolean ll = ii !=jj;
      System.out.println(ll); 
      
      System.out.println(ii>jj);//f
      boolean mm = ii >jj;
      System.out.println(mm);
      
      System.out.println(200>=200);//t
      boolean nn = 200 >=200;
      System.out.println(nn);
      
      System.out.println(100<200);//t
      boolean oo = 100>200;
      System.out.println(oo);
      
      System.out.println(2000<=300);//f
      boolean pp =2000<=300;
      System.out.println(pp);
      
      
	}

}
