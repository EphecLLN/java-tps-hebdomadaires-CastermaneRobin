package tp10;

public class BankAccount {
	public int balance; //solde

	public BankAccount(int balance) {
		super();
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	public synchronized void deposit(double amount) {
		this.balance += amount;
	}
	public synchronized void withdraw(double amount) {
		this.balance -= amount;
	}
	public double getAmount() {
		return 0;
	}
}
