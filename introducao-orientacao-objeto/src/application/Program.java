package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		System.out.println("Digite as medidas do triângulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Digite as medidas do triângulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double pX = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));
		
		double pY = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));
		
		System.out.printf("A área do triângulo X é: %.4f m² %n", areaX);
		System.out.printf("A área do triângulo Y é: %.4f m² %n", areaY);
		
		if (areaX > areaY) {
			System.out.println("O triângulo X possui maior área");
		} else if (areaY > areaX){
			System.out.println("O triângulo Y possui maior área");
		} else {
			System.out.println("Os triângulos possuem área igual");
		}
		sc.close();
	}
}
