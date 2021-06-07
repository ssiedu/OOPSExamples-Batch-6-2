package inheritance;

public class EngStud extends Stud {
	private String branch;
	private int sem;
	
	public void setEngInfo(String a, int b) {
		branch=a;
		sem=b;
	}
	public void showEngInfo() {
		System.out.println("Branch : "+branch);
		System.out.println("Semester : "+sem);
	}
	public void result(int marks) {
		if(marks>=45) {
			System.out.println("Eng Student Passed....");
		}else {
			System.out.println("Eng Student Failed....");
		}
	}
	public void admission() {
		System.out.println("Process For Engineering Admission");
	}
	public static void main(String args[]) {
		EngStud s=new EngStud();
		s.setPersonalInfo(111, "ABC");
		s.setEngInfo("CS", 4);
		s.showPersonalInfo();
		s.showEngInfo();
		s.result(45);
		s.admission();
	}
}
