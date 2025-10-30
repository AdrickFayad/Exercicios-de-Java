import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int min;
		double valor;
		
		System.out.print("Digite a quantidade de minutos: ");
		min = sc.nextInt();
	
	if (min >=100) {
			valor = (min-100)*2 + 50;
		} else {
			valor = 50;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", valor);
		
sc.close();
}
}
