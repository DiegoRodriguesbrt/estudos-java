package entities;

public class Funcionario {
	
	private int identidadeDoFuncionario;
	private String nomeDoFuncionario;
	private double salarioDoFuncionario;
	
	public Funcionario(int identidadeDoFuncionario, String nomeDoFuncionario, double salarioDoFuncionario) {
		this.identidadeDoFuncionario = identidadeDoFuncionario;
		this.nomeDoFuncionario = nomeDoFuncionario;
		this.salarioDoFuncionario = salarioDoFuncionario;
	}

	public int getIdentidadeDoFuncionario() {
		return identidadeDoFuncionario;
	}

	public void setIdentidadeDoFuncionario(int identidadeDoFuncionario) {
		this.identidadeDoFuncionario = identidadeDoFuncionario;
	}

	public String getNomeDoFuncionario() {
		return nomeDoFuncionario;
	}

	public void setNomeDoFuncionario(String nomeDoFuncionario) {
		this.nomeDoFuncionario = nomeDoFuncionario;
	}

	public double getSalarioDoFuncionario() {
		return salarioDoFuncionario;
	}

	public void setSalarioDoFuncionario(double salarioDoFuncionario) {
		this.salarioDoFuncionario = salarioDoFuncionario;
	}
	
	public void aumentaSalario(double percentual) {
		salarioDoFuncionario += salarioDoFuncionario * (percentual/100);
	}
	
	
	
	
}
