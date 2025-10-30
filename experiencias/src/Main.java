import java.util.Locale;
import java.util.Scanner;
	public class Main {

		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			System.out.print("Quantos casos você vai digitar? ");
			int n = sc.nextInt();
			int c=0, r=0, s=0;
			for (int i=0; i<n; i++) {

				System.out.print("Quantidade de cobais: ");
				int x = sc.nextInt();
				System.out.print("Tipo de cobaia: ");
				String tipo = sc.next();
				
				if (tipo.equalsIgnoreCase("C")) {
					c += x;
				} else if (tipo.equalsIgnoreCase("R")) {
					r += x;
				} else if (tipo.equalsIgnoreCase("S")) {
					s += x;
				} 
				 
			}
			int total = c + r +s;
			double pc = (double) c/total *100;
			double pr = (double) r/total *100;
			double ps = (double) s/total *100; 
										
			System.out.print("");
			System.out.println("RELATORIO FINAL");
			System.out.println("Total de cobaias: " + total);
			System.out.println("Total de coelhos: " + c);
			System.out.println("Total de ratos: " + r);
			System.out.println("Total de sapos: " + s);
			System.out.printf("Percentual de coelhos: %.2f%n", pc);
			System.out.printf("Percentual de ratos: %.2f%n", pr);
			System.out.printf("Percentual de sapos: %.2f%n", ps);

							
			
			sc.close();
		}
}
