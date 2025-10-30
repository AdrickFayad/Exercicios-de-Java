import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double troco, pago, valor;
		int quant;
		
		System.out.print("Preço unitário do produto: ");
		valor = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		quant = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		pago = sc.nextDouble();
		
		troco = pago - (quant * valor);
		
		if (troco > 0) {
			System.out.printf("TROCO = %.2f REAIS", troco);
		} 
		else {
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", Math.abs(troco));
				
		}
	
	sc.close();
		}
	}
	