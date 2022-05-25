package application;

import entities.*;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite as medidas do tri�ngulo X: ");
		x.a = sc.nextDouble();
		x.b= sc.nextDouble();
		x.c= sc.nextDouble();
		
		System.out.println("Digite as medidas do tri�ngulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
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
