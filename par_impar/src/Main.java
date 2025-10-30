import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			int x = sc.nextInt();
			
			if(x == 0) {
				System.out.println("NULO");
			} else {
				if (x%2 == 0) {
			
				System.out.print("PAR ");
			} else {
				System.out.print("IMPAR ");
			}
			if (x>0) {
				System.out.println(" POSITIVO");
			} else {
				System.out.println(" NEGATIVO");
			}
			}
		}
		
		sc.close();
	}
}
