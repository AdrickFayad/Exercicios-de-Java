import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, max;
		System.out.print("Digite as três distancias: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		if (a>b && a>c) {
		max = a;
		} else if (b>c) {
			 max = b;
		} else {
			max = c;
		}
		
		System.out.printf("MAIOR DISTANCIA = %.2f%n", max);
		sc.close();
	}
}