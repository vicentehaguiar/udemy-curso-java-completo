import java.util.Locale;
import java.util.Scanner;

import entities.AccountData;

public class Bank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		AccountData account;

		System.out.println("Enter account number: ");
		int accountNumber = scan.nextInt();

		System.out.println("Enter account holder: ");
		scan.nextLine();
		String holder = scan.nextLine();

		System.out.println("Is there a initial deposit (y/n)? ");
		char response = scan.next().charAt(0);

		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = scan.nextDouble();
			account = new AccountData(holder, accountNumber, initialDeposit);
		} else {
			account = new AccountData(holder, accountNumber);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);

		System.out.print("Enter a deposit value: ");
		double depositValue = scan.nextDouble();
		account.deposit(depositValue);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = scan.nextDouble();
		account.withdraw(withdraw);
		
		System.out.println("Updated account data: ");
		System.out.println(account);

		scan.close();
	}

}
