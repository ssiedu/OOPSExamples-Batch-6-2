package inheritance;

class P {
	public P() {
		System.out.println("P-0");
	}
	public P(int a) {
		System.out.println("P-1");
	}
	public P(int a, int b) {
		System.out.println("P-2");
	}
}

class Q extends P {
	public Q() {
		super(1);	
		System.out.println("Q-0");
	}
	public Q(int a) {
		super(1,2);
		System.out.println("Q-1");
	}
	public Q(int a, int b) {
		System.out.println("Q-2");
	}
}

public class SuperExampleTwo {

	public static void main(String[] args) {
		Q ob=new Q(10,20);
	}

}
