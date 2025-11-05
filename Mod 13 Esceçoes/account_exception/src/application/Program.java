package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Entre account data:");
		System.out.print("Number: ");
		int numberAccount = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Intial balance: ");
		double intialBalance = sc.nextDouble();
		System.out.print("Whitdraw limit: ");
		double whitdrawLimit = sc.nextDouble();
		Account account = new Account(numberAccount, holder, intialBalance, whitdrawLimit);

		System.out.print("\nEnter amount for withdraw: ");
		double amount = sc.nextDouble();

		try {
			account.withdraw(amount);
			System.out.printf("New balance: %.2f%n", account.getBalance());

		} catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());

		} catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}

		sc.close();
	}

}
