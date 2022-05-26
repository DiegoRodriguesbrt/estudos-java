package entities;

public class FuncionarioImposto {
	
	public String nomeDoFuncionario;
	public double salarioBrutoDoFuncionario;
	public double impostoDoFuncionario;
	
	public double salarioLiquido() {
		return salarioBrutoDoFuncionario - impostoDoFuncionario;
	}
	
	public void aumentoSalario(double porcentagem) {
		salarioBrutoDoFuncionario += salarioBrutoDoFuncionario * (porcentagem/100);
	}
	
	public String toString() {
		return "Funcionário: " + nomeDoFuncionario + String.format(" , R$ %.2f", salarioLiquido());
	}
}
