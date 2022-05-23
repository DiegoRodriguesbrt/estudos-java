import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		int valor = 12;
		String nome = "Diego";
		int idade = 25;
		double salario = 0;
		double x = 10.37845;
		
		System.out.println(valor);				
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		System.out.println("Resultado = " + x + " metros");
		System.out.printf("Resultado = %.2f metros %n",x);
		System.out.printf("%s tem %d anos e ganha R$%.2f reais %n",nome, idade, salario);
	}

}
