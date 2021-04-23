
public class Trial {
	private int x, y, z; // instance variables
	
	public Trial(int a, int b) {
		x=a; y=b;
	}
	public Trial(int p, int q, int r) {
		//calling two arg constructor
		this(p,q);
		z=r;
	}
	
	public void setData(int a, int b) {			//for initializing x and y only
		x=a;
		y=b;
	}
	public void setData(int p, int q, int r) {	//for initializing x, y and z all.
		setData(p,q);
		z=r;
	}
	public void show() {
		System.out.println(x+","+y+","+z);
	}
	public static void main(String args[]) {
		
		Trial t1=new Trial(10,20,30);
		//Trial t2=new Trial(40,50);
		t1.show();
		//t2.show();
		
	}
	
	
	
}
