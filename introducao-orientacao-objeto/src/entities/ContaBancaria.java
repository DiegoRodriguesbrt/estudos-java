package entities;

public class ContaBancaria {
	private int numeroDaConta;
	private String nomeDoTitular;
	private double saldoDaConta;
	
	public ContaBancaria(int numeroDaConta, String nomeDoTitular, double depositoInicial) {
		this.numeroDaConta = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
		deposita(depositoInicial);
	}
	
	public ContaBancaria(int numeroDaConta, String nomeDoTitular) {
		this.numeroDaConta = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
	}
	
	public double getSaldoDaConta() {
		return saldoDaConta;
	}
	
	public String getNomeDoTitular() {
		return nomeDoTitular;
	}
	
	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public void deposita(double valor) {
		saldoDaConta += valor;
	}
	
	public void saca(double valor) {
		saldoDaConta -= (valor +5.0);
	}
	
	public String toString() {
		return "Número da conta: " + numeroDaConta +
				" , Nome do titular: " + nomeDoTitular +
				", Saldo: R$ " + String.format("%.2f", getSaldoDaConta());
		
	}
}
