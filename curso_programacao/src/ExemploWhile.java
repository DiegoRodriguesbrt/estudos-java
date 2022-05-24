import java.util.Scanner;

public class ExemploWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		int soma = 0;
		
		while (numero != 0) {
			soma += numero;
			System.out.println("Digite um número: ");
			numero = sc.nextInt();		
		}
		System.out.printf("A soma dos números foi %d",soma);
		sc.close();
	}
}
