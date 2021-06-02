package inheritance;

class A {
	public void show() {
		System.out.println("Show of A....");
	}
}
class B extends A {
    public void show() {
		System.out.println("Show of B....");
	}
}

public class OverridingExample {

	public static void main(String[] args) {

		B ob=new B();
		ob.show();

	}

}
