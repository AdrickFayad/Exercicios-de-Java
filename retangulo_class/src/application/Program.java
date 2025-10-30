package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Rectangle;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle x;
		x = new Rectangle();
		
		System.out.println("Entre com a largura e altura do retângulo: ");
	x.width = sc.nextDouble();
	x.height = sc.nextDouble();
		
		double area, perimeter, diagonal;
		
		area = x.width * x.height;
		perimeter = 2 * (x.width + x.height);
		diagonal = Math.sqrt((x.width * x.width )+(x.height * x.height));
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PERIMETRO = %.2f%n", perimeter);
		System.out.printf("DIAGONAL = %.2f%n", diagonal);
		
		
		
	sc.close();
	}

}
