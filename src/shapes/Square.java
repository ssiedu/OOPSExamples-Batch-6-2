package shapes;

public class Square {

	private int side, area;
	
	public Square(int s) {
		//this constructor should intialize the side as well as to compute the area and display the area
		
		side=s;
		area=side*side;
		System.out.println("Area of Square With Side "+side+" Is : "+area);
		
	}
	
	public static void main(String[] args) {
	
		Square sq=new Square(5);

	}

}

