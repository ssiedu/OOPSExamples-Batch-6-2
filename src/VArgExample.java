
public class VArgExample {
/*
	public static void add(int a, int b) {
		System.out.println("SUM = "+(a+b));
	}
	*/
	public static void add(String...v) {
		String res="";
		for(String tmp:v) {
			res=res+tmp;
		}
		System.out.println(res);
	}
	public static void add(int... v) {
		int sum=0;
		
		for(int tmp:v) {
			sum=sum+tmp;
		}
	
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
		add("aa","bb");	//{"aa","bb"}
		add("xx","yy","zz");
		
	}


}
