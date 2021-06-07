package inheritance;

class Person {
	private String fname, lname;
	public Person(String fn, String ln) {
		fname=fn; lname=ln;
	}
	public void info() {
		System.out.println("First Name  : "+fname);
		System.out.println("Last  Name  : "+lname);
	}
}
//-------------------------------------------------------------------------------------------------
class Emp extends Person {
	private String desg;
	private int sal;
	public Emp(String fn, String ln, String ds, int sl) {
		//here we are going to invoke the parent class constructor for initializing fname,lname
		super(fn,ln);
		desg=ds;
		sal=sl;
	}
	public void info() {
		super.info();
		System.out.println("Designation : "+desg);
		System.out.println("Salary      : "+sal);
	}
}

//-------------------------------------------------------------------------------------------------
public class SuperExampleThree {
	public static void main(String args[]) {
		Emp e=new Emp("AAA","BBB","MANAGER",60000);
		e.info();
	}
}
//-------------------------------------------------------------------------------------------------