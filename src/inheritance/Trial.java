package inheritance;

public interface Trial {
	void m1();
	public void m2();
	default void m3() {}
	default void m4() {}
	static void m5() {}
}
