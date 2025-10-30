package Retangulo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
  	  Scanner sc = new Scanner (System.in);
	  double x, y, d, a, p;
	  
	  System.out.print("Base do retangulo: ");
	  x = sc.nextDouble();
 	  System.out.print("Altura do retangulo: ");
	  y = sc.nextDouble();
		  
		  a = x * y;
		  p = (x + x) * (a+a);
		  d = Math.sqrt((x*x)+(y*y));
	  System.out.println("Area = " + a);
	  System.out.println("Perimetro = " + p);
	  System.out.println("Perimetro = " + d);
		 
	  
	  sc.close();

	}

}
