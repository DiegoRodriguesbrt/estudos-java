import java.util.Locale;
import java.util.Scanner;

public class ExemploTerreno {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual largura do terreno?");
		double largura = sc.nextDouble();
		
		System.out.println("Qual o comprimento do terreno?");
		double comprimento = sc.nextDouble();
		
		System.out.println("Qual o pre�o do m�?");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();
	}
}