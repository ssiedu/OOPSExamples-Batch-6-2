
public class BankingApp {

	public static void main(String[] args) {
		
		Account ac1=new Account();
		Account ac2=new Account();
		Account ac3=new Account();
		Account ac4=new Account();
		
		ac1.setData(111, "AAA", 10000);
		ac2.setData(112, "BBB", 20000);
		ac3.setData(113, "CCC", 30000);
		ac4.setData(114, "DDD", 40000);
		ac1.showBalance();
		ac2.showBalance();
		ac3.showBalance();
		ac4.showBalance();
		
		
		Account.showAvg(ac1,ac2);
		Account.showAvg(ac1,ac2,ac3);
		Account.showAvg(ac1,ac2,ac3,ac4);
		
		//ac1.showAvg(ac2);
		//ac2.showAvg(ac3);
		
		/*
		Account.showBalance(ac1);
		Account.showBalance(ac2);
		Account.showBalance(ac3);
		*/
		
		
		
		/*
		ac1.showData();
		ac2.showData();
		ac3.showData();
		Account.showTotalBalance();
		*/
		
		//Account.showTotalBalance();
		//Account.showTotalBalance();
		
		
		//Account.info();
		
		/*
		ac1.showData();
		ac2.showData();
		ac3.showData();
		
		Account.showTotalBalance();
		*/
		
		
	}

}
