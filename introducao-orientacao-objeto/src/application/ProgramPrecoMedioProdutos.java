package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Produtos;

public class ProgramPrecoMedioProdutos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a quantidade de produtos? ");
		int quantidadeProdutos = sc.nextInt();
		Produtos[] vetor = new Produtos[quantidadeProdutos];
		
		double soma = 0.0;
		
		for (int i = 0; i < vetor.length ; i++) {
			
			System.out.println("Digite o nome do produto: ");
			sc.nextLine();
			String nomeDoProduto = sc.nextLine();
			System.out.println("Digite o preço do produto: ");
			double precoDoProduto = sc.nextDouble();
			
			vetor[i] = new Produtos(nomeDoProduto, precoDoProduto);
			soma += vetor[i].getPrecoDoProduto();
		}
		
		double media = soma / vetor.length;
		
		System.out.printf("A média do preço dos produtos é de R$%.2f",media);
		sc.close();
	}

}
