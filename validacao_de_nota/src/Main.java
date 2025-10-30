import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		double media = 0;
	System.out.print("Digite a primeira nota: ");
	double n1 = sc.nextDouble();
	
	while (10 < n1 || n1 < 0) {
		System.out.print("Valor invalido! Tente novamente: ");
		n1 = sc.nextDouble();
				
	}
		
		System.out.print("Digite a segunda nota: ");
		double n2 = sc.nextDouble();
		
		while (10 < n2 || n2 < 0) {
			System.out.print("Valor invalido! Tente novamente: ");
			n2 = sc.nextDouble();
					
		}
			media = (n1 + n2)/2;
			System.out.printf("Media = %.2f%n", media);
		
		sc.close();
	}
}
