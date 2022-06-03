package application;

import entities.Funcionario;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramSalarioFuncionarios {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.println("Quantos funcion�rios ser�o registrados? ");
		int quantidadeFuncionarios = sc.nextInt();
		
		for(int i=0; i < quantidadeFuncionarios; i++) {
			System.out.println("Funcionario #" + (i+1) + ": ");
			System.out.print("Id: ");
			int identidadeDoFuncionario = sc.nextInt();
			
			while (procuraID(lista, identidadeDoFuncionario)) {
				System.out.println("ID j� escolhido. Digite outro: ");
				identidadeDoFuncionario = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nomeDoFuncionario = sc.nextLine();
			System.out.println("Sal�rio: ");
			double salarioDoFuncionario = sc.nextDouble();
			
			Funcionario funcionario = new Funcionario(identidadeDoFuncionario, nomeDoFuncionario, salarioDoFuncionario);
			
			lista.add(funcionario);	
		 }
			
		System.out.println("Digite o ID do funcion�rio para aumentar sal�rio: ");
		int idAumentoSalario = sc.nextInt();
		Funcionario funcionario = lista.stream().filter(x -> x.getIdentidadeDoFuncionario() == idAumentoSalario).findFirst().orElse(null);
		if (funcionario == null) {
			System.out.println("Esse ID n�o existe! Digite outro: ");
			
		} else {
			System.out.println("Digite a porcentagem de aumento do sal�rio: ");
			double porcentagem = sc.nextDouble();
			funcionario.aumentaSalario(porcentagem);
		}
		
		System.out.println();
		System.out.println("Lista de funcion�rios: ");
		for (Funcionario cadaFuncionario : lista) {
			System.out.printf(cadaFuncionario + ", %.2f %n",cadaFuncionario.getSalarioDoFuncionario());
		}
			
			
		sc.close();	
	}	
	
		public static boolean procuraID(List<Funcionario> lista, int id) {
			Funcionario funcionario = lista.stream().filter(x -> x.getIdentidadeDoFuncionario() == id).findFirst().orElse(null);
			return funcionario != null;
		}
}

