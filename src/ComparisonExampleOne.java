
public class ComparisonExampleOne {

	public static void main(String[] args) {
		Demo d1=new Demo(10,20);
		Demo d2=new Demo(10,20);
		Demo d3=d1;
		
		boolean res1=(d1==d2);
		System.out.println(res1);
		
		boolean res2=d1.equals(d2);
		System.out.println(res2);
		
		/*
		boolean res2=(d1==d3);
		System.out.println(res2);
		*/
	}

}
