
public class Trial {
	private int x, y, z; // instance variables
	
	public void m1() {
		//this();
	}
	public Trial() {
		//m1();
		x=100;
		y=200;
		z=300;
	}
	public Trial(int a, int b) {
		this();
		x=a; y=b;
	}
	public Trial(int p, int q, int r) {
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
		
		Trial t=new Trial();
		Trial t1=new Trial(10,20,30);
		Trial t2=new Trial(40,50);
		t.show();
		t1.show();
		t2.show();
		
	}
	
	
	
}
