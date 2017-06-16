abstract class Figure{    //Declaration of abstract class with fields dimension1 
	double radius;
	double length;
	double breadth;
	abstract void findArea(int a);
	abstract void findPerimeter(int b);
}
class Circle extends Figure{
	int radius;
	Circle(int a)
	{
		radius = a;
		findArea(radius);
		findPerimeter(radius);
	}
	void findArea(int radius){
		
		System.out.println("The radius ="+radius);
		System.out.println("Area of Cirlce ="+(22/7)*(radius)*(radius));
	}
	void findPerimeter(int radius){
				System.out.println("Perimeter of Cirlce ="+ 2*(22/7)*radius);
	}
}
class Triangle extends Figure{
	int side1,side2,side3;	//Declaration of dimension of triangle
	Triangle(int a,int b,int c){ //construction declaration
		side1=a;		// to initilize the dimension by passing arguments on constructor
		side2=b;
		side3=c;
		findArea(side1,side2,side3);// Abstract function call
		findPerimeter(side1,side2,side3);
	}
	
	void findArea(int a, int b, int c){
		
		int perimeter = (a+b+c);
		float s = perimeter/2;
		System.out.println("Length of Sides of Triangle="+a+","+b+","+c);
		System.out.println("Area of Triangle ="+ Math.sqrt((s*(s-side1)*(s-side2)*(s-side3))));
	}
	void findPerimeter(int a, int b, int c){
		int perimeter = (a+b+c);
		System.out.println("Perimeter of Triangle ="+perimeter);
	}

	@Override
	void findArea(int a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void findPerimeter(int b) {
		// TODO Auto-generated method stub
		
	}
}
class Rectangle extends Figure{
	int length;
	int breadth;
	Rectangle(int a, int b){
		this.length =a;
		this.breadth =b;
		findArea(length,breadth);
		findPerimeter(length,breadth);
	}
	
	void findArea(int a, int b){
		System.out.println("Length ="+a+"Breadth="+b);
		System.out. println("Area of Rectangle ="+ a*b);
		
	}
	void findPerimeter(int a, int b){
		System.out. println("Perimeter of Rectangle ="+ 2*(a+b));
	}

	@Override
	void findArea(int a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void findPerimeter(int b) {
		// TODO Auto-generated method stub
		
	}
}
public class Assign_5_1{
	public static void main(String[] args){
		@SuppressWarnings("unused")
		Circle c1 = new Circle(7); // parameter is passed in circle constructor 
		@SuppressWarnings("unused")
		Triangle t1 = new Triangle(50,30,70);// parameter is passed in Triangle constructor
		new Rectangle(45,75);
		
	}
}