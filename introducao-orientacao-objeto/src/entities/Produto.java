package entities;

public class Produto {
	public String nomeDoProduto;
	public double precoDoProduto;
	public int quantidadeDoProduto;
	
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
