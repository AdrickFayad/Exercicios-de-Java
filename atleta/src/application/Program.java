package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int quantity, i = 0;
		System.out.print("Qual a quantidade de atletas? ");
		quantity = sc.nextInt();
		
		String maisAlto = "NULO";
		double pesoMedio = 0 , porcentagemHomen = 0, mediaAlturaF = 0, alturaMaior=0;
		int homem=0, mulher=0;
		for (; i <  quantity; i ++) {
			System.out.println("Digite os dados do atleta numero " + (i +1) + ":");
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Sexo: ");
			char sexo = sc.next().toUpperCase().charAt(0);
			
			while (sexo != 'M' && sexo != 'F') {
				System.out.print("Valor invalido! Favor digitar F ou M:");
				sexo = sc.next().toUpperCase().charAt(0);
			}
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			while (altura <= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo:");
				altura = sc.nextDouble();
			}
			System.out.print("Peso: ");
			double peso = sc.nextDouble();
			
			while (peso<= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo:");
				peso = sc.nextDouble();
			}
	          pesoMedio += peso;
	          
	          if ( altura > alturaMaior) {
	        	  maisAlto = name;
	        	  alturaMaior = altura;
	          }
		
	          if (sexo == 'F') {
	        	  mulher ++;
	        	  mediaAlturaF = altura;
	          } else {
	        	  homem ++;
	          }
	      
	        
		}    //Final do For

		pesoMedio /= quantity;
		porcentagemHomen = homem/quantity *100;		 
		sc.nextLine();
		System.out.println("RELATÓRIO: ");
		System.out.printf("Peso médio dos atletas: %.2f%n", pesoMedio);
		System.out.println("Alteta mais alto: " + maisAlto);
		System.out.printf("Porcentagem de homens: %.2f %% %n", porcentagemHomen);
		
		if (mulher ==0) {
			System.out.println("Não há mulheres cadastradas ");
			
		} else {
			mediaAlturaF /= mulher;
			System.out.println("Altura media das mulheres " + mediaAlturaF);
			
		}
		
		sc.close();
	}
}
