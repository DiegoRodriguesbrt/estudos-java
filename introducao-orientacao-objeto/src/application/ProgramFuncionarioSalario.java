package application;

import entities.FuncionarioImposto;
import java.util.Scanner;
import java.util.Locale;

public class ProgramFuncionarioSalario {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		FuncionarioImposto funcionario = new FuncionarioImposto();
		
		System.out.println("Nome do funcionário: ");
		funcionario.nomeDoFuncionario = sc.nextLine();
		
		System.out.println("Salário bruto do funcionário: ");
		funcionario.salarioBrutoDoFuncionario = sc.nextDouble();
		
		System.out.println("Imposto pago pelo funcionário: ");
		funcionario.impostoDoFuncionario = sc.nextDouble();
		
		System.out.println(funcionario);
		
		System.out.println("Qual porcentagem de aumento no salário? (%) ");
		funcionario.aumentoSalario(sc.nextDouble());
		
		System.out.println("Dado atualizado " + funcionario);
		
		sc.close();
	}
}
