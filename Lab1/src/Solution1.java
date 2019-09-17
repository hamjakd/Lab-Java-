//Assignment 3 
//No. 1
import java.math.*;

public class Solution1 {
		public static void main(String args[]) {
			
			//for rectangle
			Rectangle rect = new Rectangle();
			rect.height = 10;
			rect.width = 20;
			rect.printArea();
		
			//for triangle
			Triangle tr = new Triangle();
			tr.height = 12;
			tr.width = 24;
			tr.printArea();
			
			//for circle
			Circle cr = new Circle();
			cr.radius = (float) 2.3;
			cr.printArea();
		}
}

//abstract class
abstract class Shape {
	int height;
	int width;
	float radius;
	
	//abstract method
	abstract public void printArea();
}

//concrete class
class Rectangle extends Shape {
	public void printArea() {
		int area = height * width;
		System.out.println("Area of Rectangle is " + area +"sq.cm" );
	}
}
class Triangle extends Shape {
	public void printArea() {
	    int area = (height*width)/2 ;
	    System.out.println("Area of Triangle is " + area + "sq.cm");
	}
}

class Circle extends Shape {
	public void printArea () {
		float area = (float)(Math.PI * radius * radius); 
		System.out.println("Area of Circle is " + area + "sq.cm");
	}
}