package Idades;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String P1, P2;
		double x, y;
		double z;
		
		System.out.println("Dados da primeira pessoa: ");
		System.out.print("Nome: ");
		P1 = sc.nextLine();
		System.out.print("Idade: ");
		x = sc.nextDouble();
		System.out.println("Dados da segunda pessoa: ");
		System.out.print("Nome: ");
		sc.next();
		P2 = sc.nextLine();
		System.out.print("Idade: ");
		y = sc.nextInt();
		z = ((x + y)/2);
		System.out.printf("A idade média de " + P1 + " e " + P2 + " é de " + z + " anos");
		sc.close();
		}

}
