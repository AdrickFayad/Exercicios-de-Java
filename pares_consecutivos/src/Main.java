import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, soma; 
		System.out.print("Digite um número inteiro: ");
		x= sc.nextInt();
		
		while (x!= 0) {
				if (x%2 == 0) {
					soma = 5*x +20;
				} else {
					soma = 5*x + 25;
				}
				System.out.println("SOMA = " + soma);
				System.out.print("Digite um número inteiro: ");
				x= sc.nextInt();
				
		} 
		
		sc.close();
	}
}
