package inheritance;

class A {
	int data=100;
	void info() {
		System.out.println("Some info from parent....!");
	}
}

class B extends A {
	int data=200;
	void info() {
		System.out.println("Some info from child....!");
	}
	void show() {
		super.info();
		//System.out.println(super.data);
		//System.out.println(data);
	}
}

public class SuperExampleOne {

	public static void main(String[] args) {
		B ob=new B();
		ob.show();
		
	}

}
