package designpatterns;

//import designpatterns.Shape.Circle;
//import designpatterns.Shape.Rectangle;
//import designpatterns.Shape.ShapeFactory;
//import designpatterns.Shape.Squre;

 interface Shape {
	void draw();
 }
	class Rectangle implements Shape{
		@Override
		public void draw() {
			System.out.println("Drawing Ractangle : inside draw() of Ractangle");
		}
	}
	class Circle implements Shape{
		@Override
		public void draw() {
			System.out.println("Drawing Circle : inside draw() of Circle");
		}
	}
	class Squre implements Shape{
		@Override
		public void draw() {
			System.out.println("Drawing Squre : inside draw() of Squre");
		}
	}
	
	class ShapeFactory{
		public Shape getShape(String shapeType) {
			if(shapeType.equalsIgnoreCase("Circle"))
				return new Circle();
			else if(shapeType.equalsIgnoreCase("Ractangle"))
				return new Rectangle();
			else if(shapeType.equalsIgnoreCase("Squre"))
				return new Squre();
			else
				return null;
			
		}
	}


public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory obj= new ShapeFactory();
		
		Shape circle=obj.getShape("circle");
		circle.draw();
		
		Shape rect=obj.getShape("Ractangle");
		rect.draw();
		
		Shape squre=obj.getShape("Squre");
		squre.draw();
		
	}

}
