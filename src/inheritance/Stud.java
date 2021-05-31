package inheritance;

public class Stud {
	private int rno;
	private String name;
	
	public void setPersonalInfo(int a, String b) {
		rno=a; name=b;
	}
	public void showPersonalInfo() {
		System.out.println("Roll Number : "+rno);
		System.out.println("Stud Name   : "+name);
	}
}
