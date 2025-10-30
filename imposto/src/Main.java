import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		double salario_anual, servico, capital, medico, educacao, imposto_salario, imposto_servico, imposto_capital, max_dedutiveis, gastos_dedutiveis, imposto_bruto, abatimento, imposto_devido;
		
			System.out.print("Renda anual com salário: ");
		   salario_anual = sc.nextDouble();
		   System.out.print("Renda anual com prestação de serviço: ");
		   servico = sc.nextDouble();
		   System.out.print("Renda anual com ganho de capital: ");
		   capital = sc.nextDouble();
		   System.out.print("Gastos médicos: ");
		   medico = sc.nextDouble();
		   System.out.print("Gastos educacionais: ");
		   educacao = sc.nextDouble();
		   
		   if (salario_anual<3000*12) {
			   imposto_salario = 0;
		   }else
			   if (salario_anual<=5000*12) {
				   imposto_salario = salario_anual *0.1;
			   }else {
				   imposto_salario = salario_anual *0.2;
			   }
		   imposto_servico = servico * 0.15;
		   imposto_capital = capital * 0.2;
		   
		   imposto_bruto = (imposto_salario + imposto_servico + imposto_capital);
		   max_dedutiveis = (imposto_bruto)*0.3;
		   gastos_dedutiveis = (medico + educacao);
		   
		   if (max_dedutiveis > gastos_dedutiveis) {
			   abatimento = gastos_dedutiveis;
			   
		   }else {
			   abatimento = max_dedutiveis;
		   }
		   
		   imposto_devido = imposto_bruto - abatimento ;
		   
		   System.out.println();
		   System.out.println("RELATÓRIO DE RENDA");
		   System.out.println();
		   System.out.println("CONSOLIDADI DE RENDA:");
		   System.out.printf("Imposto sobre salário: %.2f%n", imposto_salario);
		   System.out.printf("Imposto sobre serviço: %.2f%n", imposto_servico);
		   System.out.printf("Imposto sobre ganho de capital: %.2f%n", imposto_capital);
		   System.out.println();
		   System.out.println("DEDUÇÕES:");
		   System.out.printf("Máximo dedutível: %.2f%n", max_dedutiveis);
		   System.out.printf("Gastos dedutíveis: %.2f%n", gastos_dedutiveis);
		   System.out.println();
		   System.out.println("RESUMO:");
		   System.out.printf("Imposto bruto total: %.2f%n",imposto_bruto);
		   System.out.printf("Abatimento: %.2f%n",abatimento);
		   System.out.printf("Imposto devido: %.2f%n",imposto_devido);
		   
		   
		sc.close();
	}
	}