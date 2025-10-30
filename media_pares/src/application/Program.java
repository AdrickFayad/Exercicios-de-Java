package application;

import java.util.Locale;
import java.util.Scanner;

import enteties.Pares;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		Pares [] vect = new Pares[n];
		int sum = 0;
		int nPars =0;
		for (int i =0; i<n; i++) {
			System.out.print("Digite um número: ");
			int num = sc.nextInt();
			if (num%2==0) {
				nPars ++;
			vect[i] = new Pares(num);
			sum += vect[i].getPars();
		}
		}
		double media =(double) sum/nPars;
		if (nPars == 0) {
			System.out.print("NENHUM NUMERO PAR");
		} else {
				System.out.printf("MEDIA DOS PARES = %.1f%n", media);
		}
		
		sc.close();

	}

}
