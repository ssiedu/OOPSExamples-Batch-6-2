import shapes.Circle;

public class CircleArea {

	public static void main(String[] args) {

		//here we are computing the area and circumference of Circle with radius 10.
		
		Circle c1=new Circle();
		c1.setRadius(100);
		c1.computeArea();
		c1.computeCircumference();
		
		System.out.println("______________________________________________________________");
		//here we are computing the area and circumference of Circle with radius 200
		
		Circle c2=new Circle();
		c2.setRadius(200);
		c2.computeArea();
		c2.computeCircumference();
		
	}

}
