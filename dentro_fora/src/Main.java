import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		
		int x, dentro = 0, fora =0;
		
		for (int i=0; i<n; i++ ) {
			System.out.print("Digite um número: ");
			x = sc.nextInt();
			
			if (x>=10 && x<=20) {
				dentro ++;
			} else {
				fora ++;
			}
		}
		
		System.out.println(dentro + "Dentro");
		System.out.println(fora + "Fora");
		
		
		sc.close();
	}
}
