package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account = null;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial depositiv (y/n)? ");
		char response = sc.next().toLowerCase().charAt(0);

		if (response != 'y' && response != 'n') {

			System.out.println("Error code:");
			System.out.print("Is there na initial depositiv (y/n)? ");
			response = sc.next().toLowerCase().charAt(0);

		} else {
			if (response == 'y') {
				System.out.print("Enter initial deposit value: ");
				double initialDeposit = sc.nextDouble();
				account = new Account(number, holder, initialDeposit);

			} else {
				account = new Account(number, holder);
			}
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		System.out.println();

		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data:");
		System.out.println(account);

		System.out.print("Enter a withdraw value: ");
		double whitdrawValue = sc.nextDouble();
		account.withdraw(whitdrawValue);
		System.out.println("Update account data:");
		System.out.println(account);

		sc.close();
	}
}