package inheritance;

public class MediStud extends Stud {
	private String specialization;
	private int prof;

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
	}
}
