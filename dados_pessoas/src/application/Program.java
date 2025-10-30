package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PersonalData;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		PersonalData [] vect = new PersonalData[n];
		
		for (int i =0; i<n; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			double height = sc.nextDouble();
			System.out.print("Genero da " + (i+1) + "a pessoa: ");
			char gender = sc.next().toUpperCase().charAt(0);
			vect[i] = new PersonalData(height, gender);
		}
		double majorHeight = 0;
		double shorterHeight=0;
		for (int i =0; i<n; i++) {
		if (majorHeight<=vect[i].getHeight())  {
			majorHeight = vect[i].getHeight();
			shorterHeight = majorHeight;
		} else if (shorterHeight>vect[i].getHeight()) {
			shorterHeight = vect[i].getHeight();
		}
		}
		int woman = 0;
		int man = 0;
		double heightWoman = 0;
		for (int i =0; i<n; i++) {
		if (vect[i].getGender() == 'F') {
			heightWoman += vect[i].getHeight();
			woman ++;
		} else if (vect[i].getGender() == 'M'){
			man ++;
		}
		}
		double heigtWomanMedial = heightWoman/woman;
		System.out.printf("Menor altura = %.2f%n", shorterHeight);
		System.out.printf("Maior altura = %.2f%n", majorHeight);
		System.out.printf("Media das alturas das mulheres = %.2f%n", heigtWomanMedial);
		System.out.println("Numero de homens = " + man);
		
	sc.close();
}

}
