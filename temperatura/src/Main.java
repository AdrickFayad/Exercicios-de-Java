import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double c, f;
		String tipo ;
		
		System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
		tipo = sc.nextLine();
		
		if (tipo.equalsIgnoreCase("C")) {                 //Celsius para Fahrenheit
			System.out.print("Digite a temperatura em Celsius:");
			c = sc.nextDouble();
			
			f = (c *9/5) + 32;
			System.out.printf("Temperatura equivalente em Fahrenheit: %.2f%n", f);
		} else if (tipo.equalsIgnoreCase("F")) {
			System.out.print("Digite a temperatura em Fahrenheit:");
			f = sc.nextDouble();
			
			c = 5/9 * (f -32);
			System.out.printf("Temperatura equivalente em Celsius: %.2f%n", c);
		}else {
			System.out.print("Codigo errado");
		}

		sc.close();
	}
}