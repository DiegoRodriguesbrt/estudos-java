import java.util.Scanner;
import java.util.Locale;


public class EntradaDeDados {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		char charTeste;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		charTeste = sc.next().charAt(0);
		
		System.out.println("Dados digitados: ");
		System.out.println("Voc� digitou a string: " + x);
		System.out.println("Voc� digitou o inteiro: " + y);
		System.out.println("Voc� digitou o double: " + z);
		System.out.println("Pega a primeira letra digitada: " + charTeste);
		sc.close();
	}
}
