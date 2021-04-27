
public class ComparisonExampleTwo {

	public static void main(String[] args) {
		
		String s1=new String("indore");
		String s2=new String("indore");
		String s3=s2;
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		
		
		boolean res=s1.equals(s2);
		System.out.println("Result Of Equals Method : "+res);
		

	}

}
