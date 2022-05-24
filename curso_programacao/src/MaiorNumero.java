import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 números: ");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int numero3 = sc.nextInt();
		
		int maiorNumero = max(numero1,numero2,numero3);
		
		mostraResultado(maiorNumero);
		
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		int auxiliar;
		
		if (x > y && x > z) {	
			auxiliar = x;
		} else if (y > x && y > z) {
			auxiliar = y;
		} else {
			auxiliar = z;
		}
		return auxiliar;
	}
	
	public static void mostraResultado(int valor) {
		System.out.println("O maior valor digitado foi " + valor);
	}
}
