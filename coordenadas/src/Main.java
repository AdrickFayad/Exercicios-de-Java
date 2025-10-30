import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		double a, b;
		
		System.out.print("Valor de X: ");
		a = sc.nextDouble();
		System.out.print("Valor de Y: ");
		b = sc.nextDouble();
		
		if  (a == 0 && b == 0) {
			System.out.print("Origem");
		}else 	if (a!= 0 && b==0 ) {
			System.out.print("Eixo das Abscissas");
		}else 	if (a== 0 && b!=0) {
			System.out.print("Eixos das Ordenadas");	
		} else if (a> 0 && b>0) {
			System.out.print("Q1");
		} else if (a< 0 && b>0) {
			System.out.print("Q2");
		} else if (a< 0 && b<0) {
			System.out.print("Q3");
		} else if (a> 0 && b<0) {
			System.out.print("Q4");
		}
		
		
			
		sc.close();
	}
}
