import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Double preco, dinheiro, troco;
		 int quant;
		 System.out.print("Preço unitário do produto: ");
		 preco = sc.nextDouble();
		 System.out.print("Quantidade comprada: ");
		 quant = sc.nextInt();
		 System.out.print("Dinheiro recebido: ");
		 dinheiro = sc.nextDouble();
		 troco = (double)(dinheiro -(quant * preco));
		 System.out.printf("TROCO = %.2f%n", troco);

		 
		 sc.close();

	}

}
