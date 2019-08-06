/*
 * Huimei Wu
 * CIS 36B
 * Extra Credit
 * Date Submitted: June 22
 */

public class Driver {
	public static void main(String [] args) {
		
		Outer.GeometricObject object1 = new Outer().new Triangle("red", true, 3, 4, 5);
		object1.print();
		
		System.out.printf("\n");
		
		Outer.GeometricObject object2 = new Outer().new Triangle("green", false, 6, 6, 6);
		object2.print();
		
		System.out.printf("\n");
		
		Outer.GeometricObject object3 = new Outer().new Triangle("black", false, 6, 6, 3);
		object3.print();	
		
		System.out.printf("\n");
		
		Outer.GeometricObject object4 = new Outer().new Triangle("yellow", false, 6, 3, 3);
		object4.print();	
	}
}
