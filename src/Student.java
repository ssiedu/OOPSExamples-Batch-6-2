
public class Student {
	private int rno;
	private String name;
	private int marks;
	
	public void setData(int a, String b, int c) {
		rno=a; name=b; marks=c;
	}
	
	public static void result(Student... s) {
		
		for(int i=0; i<s.length; i++) {
			System.out.println("Roll Number   : "+s[i].rno);
			System.out.println("Stud Name     : "+s[i].name);
			System.out.println("Marks Scored  : "+s[i].marks);
			System.out.println("_______________________________________________");
		}
	}
	
	public static void main(String args[]) {
		Student s1=new Student(); s1.setData(101,"AAA",60);
		Student s2=new Student(); s2.setData(102, "BBB", 70);
		Student s3=new Student(); s3.setData(103, "CCC", 90);
		
		//result(s1);
		//result(s1,s2);	//{s1,s2}
		result(s1,s2,s3); //{s1,s2,s3}
		
	}
}
