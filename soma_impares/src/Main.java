import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, y, z;
		System.out.println("Digite dois numeros: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x>y) {
			z=x;
			x=y;
			y=z;
		} 
		
		int soma =0;
		for (; x<y; x ++) {
			if (x%2 != 0) {
			soma += x;
			}
		}
		System.out.print("SOMAS DOS IMPARES = " + soma);
						

		sc.close();
	}
	}
	