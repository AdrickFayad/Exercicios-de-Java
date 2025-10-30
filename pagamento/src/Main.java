import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
       String name;
       double valor, trabalho, total;
       System.out.print("Nome: ");
       name = sc.nextLine();
       System.out.print("Valor por hora: ");
       valor = sc.nextDouble();
       System.out.print("Horas trabalhadas: ");
       trabalho = sc.nextDouble();
       total = valor * trabalho;
       System.out.printf("O pagamento para " + name + " deve ser %.2f%n", total);
      
       sc.close();
	}

}
