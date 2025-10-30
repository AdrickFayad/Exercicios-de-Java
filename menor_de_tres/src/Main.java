import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y, z, menor;
		
		System.out.print("Primeiro Valor: ");
		x = sc.nextInt();
		System.out.print("Segudno Valor: ");
		y = sc.nextInt();
		System.out.print("Terceiro Valor: ");
		z = sc.nextInt();
		
		if (x<=y) {
			menor = x;
		} else {
			  menor = y;
				
		}
			if (menor >= z) {
		
				menor = z ;
		 }
		
		System.out.print("MENOR = " + menor);
		
sc. close();
	}
}

