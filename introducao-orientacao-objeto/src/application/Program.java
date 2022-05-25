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
		
		System.out.println("Digite as medidas do triângulo X: ");
		x.a = sc.nextDouble();
		x.b= sc.nextDouble();
		x.c= sc.nextDouble();
		
		System.out.println("Digite as medidas do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
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
