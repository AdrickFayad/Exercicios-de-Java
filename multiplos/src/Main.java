import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite dois numeros inteiros: ");
		x=sc.nextInt();
		y=sc.nextInt();
		
		if (x>y) {
			if (x%y == 0) {
			System.out.print("São multiplos");
			}else {
				System.out.print("Não são multiplos");
			}
		} else { 
			if (y%x == 0) {
			System.out.print("São multiplos");
			}else {
				System.out.print("Não são multiplos");
			}
			
		}
		
			
		
		sc.close();
	}
}