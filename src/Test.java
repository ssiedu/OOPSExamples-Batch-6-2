//here we will understand the concepts of constructors


public class Test {

	private int x, y;			//instance variables
	
	public Test() {
		x=1;
		y=1;
	}
	
	public Test(Test tmp) {
		x=tmp.x;
		y=tmp.y;
	}
	
	public Test(int a, int b) {
		x=a; y=b;
	}
	
	public void setData(int a, int b) {
		x=a; y=b;
	}
	
	public void show() {
		System.out.println(x+","+y);
	}
	
	public static void main(String[] args) {

		Test t1=new Test(10,20);			
		t1.show();
		
		Test t2=new Test(30,40);
		t2.show();
		
		Test t3=new Test(t2);
		t3.show();

	}

}
