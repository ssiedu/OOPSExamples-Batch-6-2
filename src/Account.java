
public class Account {
	
	private int ano;
	private String name;
	private int balance;
	private static int totalBalance;

	
	public static void showAvg(Account... v) {
		//adding balances of all accounts
		int sum=0;
		for(int i=0; i<v.length; i++) {
			sum=sum+v[i].balance;
		}
		System.out.println("AVG BALANCE : "+(sum/v.length));
	}
	
	/*
	public static void showAvg() {
		System.out.println("Avg of 0 : 0");
	}
	public static void showAvg(Account tmp1, Account tmp2, Account tmp3, Account tmp4) {
		System.out.println("Avg of 4 : "+(tmp1.balance+tmp2.balance+tmp3.balance+tmp4.balance)/4);
	}
	
	public static void showAvg(Account tmp1, Account tmp2, Account tmp3) {
		System.out.println("Avg of 3 : "+(tmp1.balance+tmp2.balance+tmp3.balance)/3);
	}
	
	public static void showAvg(Account tmp1, Account tmp2) {
		System.out.println("Avg of 2 : "+(tmp1.balance+tmp2.balance)/2);
	}
	*/
	public void showBalance() {
		System.out.println("Balance in "+ano+" is "+balance);
	}
	/*
	public static void showBalance(Account tmp) {
		System.out.println("Balance in account "+tmp.ano+" is "+tmp.balance);
	}
	*/
	
	public static void showTotalBalance() {
		System.out.println("Total Balance  : "+totalBalance);
	}
					    
	public void showData() {
		System.out.println("Account Number : "+ano);
		System.out.println("Cust.   Name   : "+name);
		System.out.println("Balance   Rs.  : "+balance);
		System.out.println("_____________________________________________");
	}
	public void setData(int x, String y, int z) {
		ano=x;
		name=y;
		balance=z;
		totalBalance=totalBalance+z;
	}
}

