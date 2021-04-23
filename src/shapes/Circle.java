
//here we are creating blueprint of a Circle object
package shapes;
public class Circle {

	//data-members (variables for storing the property values of an object)
	private double radius, area, circumference;
	private static double PI=3.14;
	
	//methods (to perform operations on an object)
	public void setRadius(double r) {
		radius=r;
	}
	public void computeArea() {
		area = PI*radius*radius;
		System.out.println("Area of Circle  : "+area);
	}
	public void computeCircumference() {
		circumference=2*PI*radius;
		System.out.println("Circumference of Circle : "+circumference);
	}
	
}
