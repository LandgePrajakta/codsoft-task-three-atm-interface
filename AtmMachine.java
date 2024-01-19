package atm_interface;

import java.util.Scanner;

public class AtmMachine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the ATM!");

		UserBankAccount userBankAccount = new UserBankAccount(1000.0); // Initial account balance of the user is 1000 Rs

		while (true) {
			System.out.println("\nPlease select one of the options below : ");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit\n");

			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.print("\nEnter withdrawal amount: ");
				double withdrawalAmount = sc.nextDouble();
				if (userBankAccount.withdraw(withdrawalAmount)) {
					System.out
							.println("\nWithdrawal successful.Remaining balance is Rs " + userBankAccount.checkBalance()+"/-");
				} else {
					System.out.println("\nInsufficient balance in the account. Withdrawal failed.");
				}
				break;

			case 2:
				System.out.print("\nEnter deposit amount: ");
				double depositAmount = sc.nextDouble();
				userBankAccount.deposit(depositAmount);
				System.out.println(
						"\nDeposit successful.Balance in your account is: Rs " + userBankAccount.checkBalance()+"/-");
				break;

			case 3:
				System.out.println("\nCurrent balance is Rs " + userBankAccount.checkBalance()+"/-");
				break;

			case 4:
				System.out.println("\nThank you for using the ATM service!");
				sc.close();

				System.exit(0);

			default:
				System.out.println("\nInvalid option. Please select a valid option.");
			}
		}
	}
}
