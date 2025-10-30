import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos casos você vai digitar? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite três números: ");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double media = (2*a + 3*b + 5*c)/ 10;
			
			System.out.printf("MEDIA = %.1f%n", media);
		}
		
		
		
		sc.close();
	}
}
