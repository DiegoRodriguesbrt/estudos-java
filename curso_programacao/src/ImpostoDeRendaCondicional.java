import java.util.Scanner;
import java.util.Locale;

public class ImpostoDeRendaCondicional {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario;
		
		System.out.println("Qual o seu salário? (R$) ");
		salario = sc.nextDouble();
		
		if (salario >= 0 && salario <= 2000) {
			System.out.println("Isento do pagamento de imposto de renda!");
		}
		
		else if (salario > 2000 && salario <= 3000) {
			double imposto = (salario - 2000) * 0.08;
			System.out.printf("O valor do imposto a ser pago é de: R$ %.2f ", imposto);	
		}
		
		else if (salario > 3000 && salario <= 4500) {
			double imposto = ((salario - 3000) * 0.18) + (1000 * 0.08);
			System.out.printf("O valor do imposto a ser pago é de: R$ %.2f ", imposto);
		}
		else {
			double imposto = ((salario - 4500) * 0.28) + (1500 * 0.18) + (1000 * 0.08);
			System.out.printf("O valor do imposto a ser pago é de: R$ %.2f ", imposto);
		}
		
		
		
	}
}
