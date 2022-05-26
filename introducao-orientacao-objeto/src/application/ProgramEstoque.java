package application;


import entities.Produto;
import java.util.Scanner;
import java.util.Locale;

public class ProgramEstoque {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Informações do produto: ");
		System.out.println("Digite o nome do produto: ");
		String nomeDoProduto = sc.nextLine();
		
		System.out.println("Digite o preço do produto: ");
		double precoDoProduto = sc.nextDouble();
		
		System.out.println("Quantidade em estoque: ");
		int quantidadeDoProduto = sc.nextInt();
		
		Produto produto = new Produto(nomeDoProduto, precoDoProduto, quantidadeDoProduto);
		
		System.out.println();
		System.out.println(produto);
		
		System.out.println();
		System.out.println("Quantidade de produtos para adicionar ao estoque: ");
		int quantidadeAdicionado = sc.nextInt();
		
		produto.adicionaProduto(quantidadeAdicionado);
		
		System.out.println();
		System.out.println(produto);
		
		System.out.println();
		System.out.println("Quantidade de produtos para remover do estoque: ");
		int quantidadeRemovida = sc.nextInt();
		produto.removeProduto(quantidadeRemovida);
		
		System.out.println();
		System.out.println(produto);
		
		sc.close();
	}

}
