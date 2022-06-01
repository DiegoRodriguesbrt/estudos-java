package entities;

public class Produtos {
	
	private String nomeDoProduto;
	private double precoDoProduto;
	
	public Produtos(String nomeDoProduto, double precoDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
		this.precoDoProduto = precoDoProduto;
	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public double getPrecoDoProduto() {
		return precoDoProduto;
	}

	public void setPrecoDoProduto(double precoDoProduto) {
		this.precoDoProduto = precoDoProduto;
	}
	

}
