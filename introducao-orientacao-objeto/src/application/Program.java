package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		System.out.println("Digite as medidas do tri�ngulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Digite as medidas do tri�ngulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double pX = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));
		
		double pY = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));
		
		System.out.printf("A �rea do tri�ngulo X �: %.4f m� %n", areaX);
		System.out.printf("A �rea do tri�ngulo Y �: %.4f m� %n", areaY);
		
		if (areaX > areaY) {
			System.out.println("O tri�ngulo X possui maior �rea");
		} else if (areaY > areaX){
			System.out.println("O tri�ngulo Y possui maior �rea");
		} else {
			System.out.println("Os tri�ngulos possuem �rea igual");
		}
		sc.close();
	}
}
