package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramClass {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		double sum =0;
		for (int i =0; i<n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect [i]= new Product(name, price);
			sum += vect[i].getPrice();
		}
		double media = sum/n;
		System.out.printf("AVARAGE PRICE: %.2f%n", media);
		
		
	sc.close();
}
}
