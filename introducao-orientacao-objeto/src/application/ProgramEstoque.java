package application;


import entities.Produto;
import java.util.Scanner;
import java.util.Locale;

public class ProgramEstoque {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Informações do produto: ");
		System.out.println("Digite o nome do produto: ");
		produto.nomeDoProduto = sc.nextLine();
		
		System.out.println("Digite o preço do produto: ");
		produto.precoDoProduto = sc.nextDouble();
		
		System.out.println("Quantidade em estoque: ");
		produto.quantidadeDoProduto = sc.nextInt();
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
