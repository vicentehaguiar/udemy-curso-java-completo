package entities;

public class AccountData {
	private String holder;
	private int accountNumber;
	private double balance;

	public AccountData(String holder, int accountNumber) {
		this.holder = holder;
		this.accountNumber = accountNumber;
	}

	public AccountData(String holder, int accountNumber, double initialDeposit) {
		this.holder = holder;
		this.accountNumber = accountNumber;
		deposit(initialDeposit);
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;

	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	public String toString () {
		return "Account "+ accountNumber +", Holder: "+holder+", balance: $"+String.format("%.2f", balance);
	}
}