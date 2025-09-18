class Account {
	private double balance;

	// Authenticate user
	private boolean validate(String userName, String password) {
		return userName.equalsIgnoreCase("sachin") && password.equals("sachin123");
	}

	// Deposit money
	public void deposit(double amount, String userName, String password) {
		if (validate(userName, password)) {
			balance += amount;
			System.out.println("Credited ₹" + amount + " to the account.");
		} else {
			System.out.println("Invalid username/password. Try again...");
		}
	}

	// Withdraw money
	public double withdraw(double amount, String userName, String password) {
		if (validate(userName, password)) {
			if (amount <= balance) {
				balance -= amount;
				System.out.println("Debited ₹" + amount + " from the account.");
				return amount;
			} else {
				System.out.println("Insufficient balance.");
				return 0.0;
			}
		} else {
			System.out.println("Invalid username/password. Try again...");
			return 0.0;
		}
	}

	// Check balance
	public double getBalance() {
		return balance;
	}
}

public class TestApp {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.deposit(1000.0, "sachin", "sachin123");

		double withdrawn = acc.withdraw(500.0, "sachin", "sachin123");
		System.out.println("Withdrawing ₹" + withdrawn + " from account");

		System.out.println("Current Balance: ₹" + acc.getBalance());
	}
}
