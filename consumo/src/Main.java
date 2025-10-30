import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int km;
		double gasto, consumo;
		
		System.out.print("Distancia percorida: ");
		km = sc.nextInt();
		System.out.print("Combustivel gasto: ");
		gasto = sc.nextDouble();
		consumo = km/gasto;
		System.out.printf("Consumo media = %.3f%n", consumo);
		
		sc.close();
	}

}
