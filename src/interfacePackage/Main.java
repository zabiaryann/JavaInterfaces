package interfacePackage;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		//Circle circle = new Circle(5.0);
	
		/*System.out.println("Circle Area: " + circle1.calculateArea());
		System.out.println("Circle Perimeter: " + circle1.calculatePerimeter());*/
	
		
		ArrayList<Circle> cList = new ArrayList<Circle>();
		
		Circle circle1 = new Circle(5.1);
		Circle circle2 = new Circle(5.2);
		Circle circle3 = new Circle(5.3);
		Circle circle4 = new Circle(5.4);
		
		cList.add(circle1);
		cList.add(circle2);
		cList.add(circle3);
		cList.add(circle4);
		
		for(Circle c : cList) {
			System.out.println("--------------------------------------");
			System.out.println("Circle Area: " + c.calculateArea());
			System.out.println("Circle Perimeter: " + c.calculatePerimeter());
		}
		
	}
}
 