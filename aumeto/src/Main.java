import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		double salario, aumento, novo_salario;
		int porcentagem;
		
		System.out.print("Digite o salario da pessoa: ");
		salario = sc.nextDouble();
		
		if(salario <= 1000) {
			porcentagem = 20;
		} else if (salario <= 3000) {
			porcentagem = 15;
		} else if (salario <= 8000) {
			porcentagem = 10;
		} else {
			porcentagem = 5;
		}
		aumento = salario * porcentagem / 100;
		novo_salario = salario + aumento;
		
		System.out.printf("Novo salario = R$ %.2f%n", novo_salario);
		System.out.printf("Aumento = R$ %.2f%n", aumento);
		System.out.println("Pocentagem = R$ " + porcentagem + " %");
		
		
		sc.close();
	}
}
