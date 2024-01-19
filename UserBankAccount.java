package atm_interface;

public class UserBankAccount {

	private double balance;

	public UserBankAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	public double checkBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public boolean withdraw(double amount) {
		if (amount > balance) {
			return false; // Insufficient balance in the account hence withdraw not possible
		}
		balance -= amount;
		return true; // Withdrawal of amount successful
	}
}
