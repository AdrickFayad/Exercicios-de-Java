import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	  double n1 , n2, nota;
	  System.out.print("Digite a primeira nota: ");
	  n1= sc.nextDouble();
	  System.out.print("Digite a segunda nota: ");
	  n2= sc.nextDouble();
	  nota = (n1 + n2)/2;
	  System.out.printf("NOTA = %.1f%n", nota);
	  if (nota < 60) {
		  System.out.print("REPROVADO");
	  }
	  sc.close();
	}		
}