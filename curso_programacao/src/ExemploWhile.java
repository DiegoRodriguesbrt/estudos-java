import java.util.Scanner;

public class ExemploWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero = sc.nextInt();
		
		int soma = 0;
		
		while (numero != 0) {
			soma += numero;
			System.out.println("Digite um n�mero: ");
			numero = sc.nextInt();		
		}
		System.out.printf("A soma dos n�meros foi %d",soma);
		sc.close();
	}
}
