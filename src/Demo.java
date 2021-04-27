
public class Demo {
	private int x, y;			
	
	public Demo(int a, int b) {x=a; y=b;}
	
	public boolean equals(Demo other) {
		if(x==other.x && y==other.y) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public void print() {
		System.out.println(x+","+y);
	}
	
	public static void main(String args[]) {
		
		Demo d1;	//just declaring a reference
		new Demo(10,20);	//creating a object (not storing it to a ref) (eligible for GC)
		Demo d2=new Demo(30,40); //creating a ref and object both and assigning adr to d2
		
		//d2.print();
		Demo d3=d2;		//assigning the address stored in d2 to a new reference d3 (now d2 and d3 both points to same object)
		d1=d2;			//assigning the address stored in d2 to d1
		d1.print();
		d2.print();
		d3.print();
		System.out.println("_____________________________________________");
		d3=new Demo(50,60);
		d1.print();
		d2.print();
		d3.print();
		
		
		
		
		
		
		
	}
}
