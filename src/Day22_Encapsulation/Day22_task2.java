package Day22_Encapsulation;

abstract class shape {
	abstract int RectangleArea(int length, int width);
	abstract double SquareArea(double side);
	abstract double CircleArea(double radius);
}
class Area extends shape {
	//if someone said this will return the value then it will come with datatype not void 
	int RectangleArea(int length, int width) {
		int R = length * width;
		return R;
	}

	double SquareArea(double side) {
		double s = side * 4;
		return s;
	}

	double CircleArea(double radius) {
		double C = 2 * 3.14 * radius;
		return C;
	}
}
public class Day22_task2 {
public static void main(String[] args) {
		Area ar = new Area();
        int Rectangle1 = ar.RectangleArea(2, 2);
		System.out.println(Rectangle1);

		double Square1 = ar.SquareArea(3);
		System.out.println(Square1);

		double Circle1 = ar.CircleArea(4);
		System.out.println(Circle1);
	}
}
