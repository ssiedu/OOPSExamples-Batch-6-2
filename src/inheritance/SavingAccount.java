package inheritance;

public class SavingAccount implements Account {

	@Override
	public void openAccount() {
		System.out.println("opening a saving account...");
	}

	@Override
	public void closeAccount() {
		System.out.println("closing a saving account...");
	}

	@Override
	public void deposit(int amount) {
		System.out.println("depositing in saving account...");
		
	}

	@Override
	public void withdraw(int amount) {
		System.out.println("withdrawing from saving account...");
		
	}
	
	
}
