package Day17_Hierarchical_inheritance;

public class Phone {
	//hirerarchichal exmple of parant class 

	int imei = 333333;
	String make;
	String color;
	int memory;
	String camara;

	void makecalls() {
		System.out.println("IMEI :" + imei + "\nmake :" + make + "\ncolor :" + color + "\nmemory :" + memory
				+ "\ncamara :" + camara);
		// this " \n " will take you to the next line
	}

}
