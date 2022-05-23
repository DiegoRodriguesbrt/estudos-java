import java.util.Scanner;
import  java.util.Locale;

public class OperadoraTelefonia {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual foi a quantidades de minutos consumido? ");
		int minutos = sc.nextInt();
		
		double conta = 50.00;
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2;
		}
		
		System.out.printf("Valor da conta = R$ %.2f", conta);
		
		sc.close();
	}
}
