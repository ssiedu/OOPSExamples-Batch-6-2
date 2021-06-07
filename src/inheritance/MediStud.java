package inheritance;

public class MediStud extends Stud {
	private String specialization;
	private int prof;
	public void admission() {
		System.out.println("Admission Process For Medical...!");
	}
	public void result(int marks) {
		if(marks>=50) {
			System.out.println("MediStud Passed....");
		}else {
			System.out.println("MediStud Failed....");
		}
	}
	public void setMediInfo(String a, int b) {
		specialization = a;
		prof = b;
	}

	public void showMediInfo() {
		System.out.println("Specialization : " + specialization);
		System.out.println("Prof : " + prof);
	}
	
	public static void main(String args[]) {
		MediStud s=new MediStud();
		s.setPersonalInfo(1001, "PQR");
		s.setMediInfo("Medicine", 2);
		s.showPersonalInfo();
		s.showMediInfo();
		s.result(48);
		s.admission();
	}
}
