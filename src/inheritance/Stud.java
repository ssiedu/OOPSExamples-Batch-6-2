package inheritance;

public class Stud {
	private int rno;
	private String name;
	private final int PASSING_MARKS=33;
	
	public final void result(int marks) {
		//PASSING_MARKS++;
		if(marks>=PASSING_MARKS) {
			System.out.println("Student Passed....");
		}else {
			System.out.println("Student Failed....");
		}
	}
	public void setPersonalInfo(int a, String b) {
		rno=a; name=b;
	}
	public void showPersonalInfo() {
		System.out.println("Roll Number : "+rno);
		System.out.println("Stud Name   : "+name);
	}
}
