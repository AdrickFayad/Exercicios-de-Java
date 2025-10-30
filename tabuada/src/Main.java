import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Deseja a tabuada para qual valor? ");
		int x = sc.nextInt();
		
		for (int i = 1 ; i < 11; i = i +1) {
			int valor = x * i;
			System.out.println(x + " X " + i + " = " + valor);
		}
		
		
		sc.close();
	}
}
