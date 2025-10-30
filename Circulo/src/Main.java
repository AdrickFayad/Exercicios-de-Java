import java.util.Locale;
import java.util.Scanner;

public class Main {
	  
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		double x, area;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio do circulo: ");
		x = sc.nextDouble();
		area = Math.PI * x * x;
	   
		System.out.printf("AREA = %.3f%n", area);
	sc.close();
	}

}
