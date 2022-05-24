import java.util.Scanner;
import java.util.Locale;
public class EstruturaDoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char jogarNovamente;
		do {
			System.out.println("Digite uma temperatura(Celsius):");
			double temperatura = sc.nextDouble();
			
			double temperaturaFahrenheit = (9*temperatura)/5 + 32;
			System.out.printf("A temperatura em Celsius é equivalente a " + temperaturaFahrenheit+  " Fahrenheit %n");
			System.out.println("Você gostaria de jogar novamente? [S/N]");
			jogarNovamente = sc.next().charAt(0);
		} while (jogarNovamente == 'S');
		
		sc.close();

}
}