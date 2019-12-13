package tp10;

public class Salary extends Thread{

	private BankAccount bankAccount;
	
	public Salary(BankAccount bankAccount) {
		super();
		this.bankAccount = bankAccount;
	}

	public void run() {
		for(int i = 0; i < 100; i++) {
			this.bankAccount.deposit(10);
		}
	}
}
