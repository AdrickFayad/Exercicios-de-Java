import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos casos você vai digitar? ");
		int n = sc.nextInt();
	
		for (int i=0; i<n; i++) {
			System.out.print("Entre com o númerador: ");
			int a = sc.nextInt();
			System.out.print("Entre com o denominador: ");
			int b = sc.nextInt();
			
			if (b==0) {
				System.out.print("Divisão impossivel");
				
			} else {
			double divisao = (double) a/b;
			System.out.printf("DIVISÃO = %.2f%n", divisao);
					
			}
		}
		
		sc.close();
	}
}
