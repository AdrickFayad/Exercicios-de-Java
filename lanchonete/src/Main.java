import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantity, cody;
		double value = 0;
		System.out.print("Codigo do produto comprado: ");
		cody = sc.nextInt();
		System.out.print("Quantidade comprada: ");
		quantity = sc.nextInt();
		
		switch (cody) {
		case 1:
			value =(double) 5 * quantity;
			break;
		case 2:
			value =(double) 3.5 * quantity;
			break;
		case 3:
			value =(double) 4.8 * quantity;
			break;
		case 4:
			value =(double) 8.9 * quantity;
			break;
		case 5:
			value =(double) 7.32 * quantity;
			break;
			
		default: 
		 
		System.out.print("Codigo errado.");
		break;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", value);
sc.close();
	}
		

    
}

