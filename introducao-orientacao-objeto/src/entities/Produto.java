package entities;

public class Produto {
	private String nomeDoProduto;
	private double precoDoProduto;
	private int quantidadeDoProduto;
	
	public Produto(String nome, double preco, int quantidade) {
		this.nomeDoProduto = nome;
		this.precoDoProduto = preco;
		this.quantidadeDoProduto = quantidade;
	}
	
	public void setNomeDoProduto(String nome) {
		this.nomeDoProduto = nome;
	}
	
	public String getNomeDoProduto() {
		return nomeDoProduto;
	}
	
	public void setPrecoDoProduto(double preco) {
		this.precoDoProduto = preco;
	}
	
	public double getPrecoDoProduto() {
		return precoDoProduto;
	}	
	
	public int getQuantidadeDoProduto() {
		return quantidadeDoProduto;
	}	
	
	public double valorEmEstoque() {
		return precoDoProduto * quantidadeDoProduto;
	}
	
	public void adicionaProduto(int quantidade){
		this.quantidadeDoProduto += quantidade;	
	}
	
	public void removeProduto(int quantidade) {
		this.quantidadeDoProduto -= quantidade;
	}
	
	public String toString() {
		return "Informações do produto: " + nomeDoProduto + ", R$ " + String.format("%.2f", precoDoProduto ) +
				", " + quantidadeDoProduto + " unidades, Total em estoque: R$ "
				+ String.format("%.2f", valorEmEstoque());
	}
}
