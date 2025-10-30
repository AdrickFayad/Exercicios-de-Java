import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int x, y;
		
		System.out.println("Digite dois números: ");
		x=sc.nextInt();
		y=sc.nextInt();
		
		while (x != y) {
			
			if (x < y) {
				System.out.println("CRESCENTE!");
				System.out.println("Digite outros dois números: ");
				x=sc.nextInt();
				y=sc.nextInt();
				
			} else {
				System.out.println("DECRESCENTE!");
				System.out.println("Digite outros dois números: ");
				x=sc.nextInt();
				y=sc.nextInt();
				
			}
			
		}
		
		sc.close();
	}
}
