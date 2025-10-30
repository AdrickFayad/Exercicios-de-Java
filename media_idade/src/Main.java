import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int idade, i = 0;
		double media = 0;
		
		System.out.println("Digite as idades: ");
		
		idade = sc.nextInt();
		
		while (idade > 0) {
			i ++;
			media += idade;
			idade = sc.nextInt();
		} 
	media = (media/i);
	if (i == 0) {
		System.out.println("IMPOSSIVEL CALCULAR");
		
	} else {
	 System.out.printf("MEDIA = %.2f%n", media);
	}
		
		sc.close();
	}
}
