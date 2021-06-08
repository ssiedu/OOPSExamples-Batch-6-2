package inheritance;

public class AccountManager {

	public static void main(String[] args) {
		Account ac1=new SavingAccount();
		ac1.openAccount();
		ac1.closeAccount();
		ac1.deposit(5000);
		ac1.withdraw(2000);
		System.out.println("_______________________________________________________");
		Account ac2=new CurrentAccount();
		ac2.openAccount();
		ac2.closeAccount();
		ac2.deposit(10000);
		ac2.withdraw(1500);
	}

}
