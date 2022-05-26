package application;

import entities.Retangulo;
import java.util.Scanner;
import java.util.Locale;

public class ProgramRetangulo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Qual a largura do tri�ngulo? ");
		retangulo.larguraDoRetangulo = sc.nextDouble();
		
		System.out.println("Qual a altura do tri�ngulo? ");
		retangulo.alturaDoRetangulo = sc.nextDouble();
		
		System.out.printf("�rea do ret�ngulo: %.2f %n", retangulo.area());
		System.out.printf("Per�metro do ret�ngulo: %.2f %n", retangulo.perimetro());
		System.out.printf("Diagonal do ret�ngulo: %.2f %n", retangulo.diagonal());
		sc.close();
	}
}
