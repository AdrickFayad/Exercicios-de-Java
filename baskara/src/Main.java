import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int a, b, c, delta;
		double x1, x2;
		System.out.print("Digite o valor de a: ");
		a = sc.nextInt();
		System.out.print("Digite o valor de b: ");
		b = sc.nextInt();
		System.out.print("Digite o valor de c: ");
		c = sc.nextInt();
		delta = (b * b) - (4 * a * c);
		
		if (delta < 0) {
			System.out.print("Está equação não possui raiz real");
		}
		else {
			x1 = (- b + Math.sqrt(delta))/ 2 * a;
			x2 = (- b - Math.sqrt(delta))/ 2 * a;
			System.out.printf("x1 = %.4f%n", x1);
			System.out.printf("x2 = %.4f%n", x2);
		}
			
		sc.close();
 	}
}