package inheritance;

public abstract class Stud {
	private int rno;
	private String name;
	private final int PASSING_MARKS=33;
	
	public abstract void result(int marks);
	public abstract void admission();
	
	public void setPersonalInfo(int a, String b) {
		rno=a; name=b;
	}
	public void showPersonalInfo() {
		System.out.println("Roll Number : "+rno);
		System.out.println("Stud Name   : "+name);
	}
}
