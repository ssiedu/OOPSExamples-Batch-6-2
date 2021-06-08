package inheritance;

public class CurrentAccount implements Account {
	@Override
	public void openAccount() {
		System.out.println("opening a current account...");
	}

	@Override
	public void closeAccount() {
		System.out.println("closing a current account...");
	}

	@Override
	public void deposit(int amount) {
		System.out.println("depositing in current account...");
		
	}

	@Override
	public void withdraw(int amount) {
		System.out.println("withdrawing from current account...");
		
	}
}
