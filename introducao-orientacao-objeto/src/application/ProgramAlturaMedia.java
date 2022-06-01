package application;

import java.util.Scanner;
import java.util.Locale;

public class ProgramAlturaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a quantidade de pessoas? ");
		int quantidadePessoas = sc.nextInt();
		
		double[] vect = new double[quantidadePessoas];
		double soma = 0.0;
		
		for (int i = 0 ; i < quantidadePessoas; i++) {
			System.out.println("Digite altura da pessoa [m]: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
			
		}
		
		double media = soma/quantidadePessoas;
		
		System.out.printf("A média da altura das pesssoas é de: %.2f m ", media);
		
		sc.close();
	}

}
