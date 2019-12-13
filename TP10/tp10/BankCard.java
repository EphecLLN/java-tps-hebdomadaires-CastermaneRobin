package tp10;

public class BankCard extends Thread{

	private BankAccount bankAccount;
	
	public BankCard(BankAccount bankAccount) {
		super();
		this.bankAccount = bankAccount;
	}

	public void run() {
		for(int i = 0; i < 100; i++) {
			this.bankAccount.withdraw(10);
		}
	}
}
