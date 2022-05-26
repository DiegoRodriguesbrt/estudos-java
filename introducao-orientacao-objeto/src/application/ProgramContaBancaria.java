package application;

import entities.ContaBancaria;
import java.util.Scanner;

public class ProgramContaBancaria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ContaBancaria conta;
		
		System.out.println("Digite um n�mero da Conta: ");
		int numeroDaConta = sc.nextInt();
		
		System.out.println("Digite o nome do titular: ");
		sc.nextLine();
		String titularDaConta = sc.nextLine();
		
		System.out.println("Vai ter um dep�sito inicial? [s/n] ");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 's') {
			System.out.println("Digite o valor de dep�sito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new ContaBancaria(numeroDaConta, titularDaConta, depositoInicial);
		} else {
			conta = new ContaBancaria(numeroDaConta, titularDaConta);
		}
		
		System.out.println();
		System.out.println("Dados da Conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite um valor para dep�sito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposita(valorDeposito);
		System.out.println("Dados da Conta atualizado: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite um valor para saque: ");
		double valorSaque = sc.nextDouble();
		
		if ( conta.getSaldoDaConta() < 0 || valorSaque > conta.getSaldoDaConta()) {
			System.out.println("Saldo indispon�vel para saque");
		} else {
			conta.saca(valorSaque);
			System.out.println("Dados da Conta atualizado: ");
			System.out.println(conta);	
		}
		
		sc.close();
	}
	
}
