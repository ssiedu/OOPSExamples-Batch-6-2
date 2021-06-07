package inheritance;

abstract class X {
	void m1() {}
	void m2() {}
	abstract void m3();
	abstract void m4();
}
class Y extends X {
	void m3() {}
	void m4() {}
}
public class AbstractExampleOne {

	public static void main(String[] args) {
		//X ob=new X();
		Y ob=new Y();
		ob.m1();
		ob.m2();
		ob.m3();
		ob.m4();
	}

}
