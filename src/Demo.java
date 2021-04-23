
public class Demo {
	int x, y;			//instance variables (non-static variables)
	static int p, q;	//class variables (static variables)
	
	public static void main(String args[]) {
		
		Demo d1=new Demo();	//1st instance
		Demo d2=new Demo();	//2nd instance
		Demo d3=new Demo();	//3rd instance
		
		d1.x=10; d1.y=20;
		d2.x=30; d2.y=40;
		d3.x=50; d3.y=60;
		
		System.out.println("Members of  d1 : "+d1.x+","+d1.y);
		System.out.println("Members of  d2 : "+d2.x+","+d2.y);
		System.out.println("Members of  d3 : "+d3.x+","+d3.y);
		System.out.println("_________________________________________________");
		
		d1.p=11; d1.q=12;
		d2.p=13; d2.q=14;
		d3.p=15; d3.q=16;
		
		System.out.println("Class Members Using d1 : "+d1.p+","+d1.q);
		System.out.println("Class Members Using d2 : "+d2.p+","+d2.q);
		System.out.println("Class Members Using d3 : "+d3.p+","+d3.q);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
