package inheritance;

public class MEStud extends EngStud {

	private String rtopic;
	
	public void setMEInfo(String s) {
		rtopic=s;
	}
	public void showMEInfo() {
		System.out.println("Research Topic : "+rtopic);
	}
	
	public static void main(String[] args) {
		MEStud s=new MEStud();
		s.setPersonalInfo(1001, "XYZ");
		s.setEngInfo("CS", 2);
		s.setMEInfo("WebTech");
		s.showPersonalInfo();
		s.showEngInfo();
		s.showMEInfo();
		
	}

}
