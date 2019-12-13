package tp10;

public class BankAccount {
	public int balance;

	public BankAccount(int balance) {
		super();
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		this.balance += amount;
	}
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	public double getAmount() {
		return 0;
	}
}
