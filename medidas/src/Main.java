import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, square, trian, trap;
		System.out.print("Digite a medida A: ");
		a = sc.nextDouble();
		System.out.print("Digite a medida B: ");
		b = sc.nextDouble();
		System.out.print("Digite a medida C: ");
		c = sc.nextDouble();
		
		square = a * a;
		trian = (a * b)/2;
		trap = ((a + b)*c)/2;
		
		System.out.println("AREA DO QUADRADO: " + square);
		System.out.println("AREA DO TRIANGULO: " + trian);
		System.out.print("AREA DO TRAPEZIO: " + trap);
		
		sc.close();

	}

}
