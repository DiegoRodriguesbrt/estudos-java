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
		
		System.out.println("Quantos funcionários serão registrados? ");
		int quantidadeFuncionarios = sc.nextInt();
		
		for(int i=0; i < quantidadeFuncionarios; i++) {
			System.out.println("Funcionario #" + (i+1) + ": ");
			System.out.print("Id: ");
			Integer identidadeDoFuncionario = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nomeDoFuncionario = sc.nextLine();
			System.out.println("Salário: ");
			Double salarioDoFuncionario = sc.nextDouble();
			
			Funcionario funcionario = new Funcionario(identidadeDoFuncionario, nomeDoFuncionario, salarioDoFuncionario);
			
			lista.add(funcionario);	
			
			System.out.println("Digite o ID do funcionário para aumentar salário: ");
			Integer idAumentoSalario = sc.nextInt();
			Integer posicao = posicaoID(lista, identidadeDoFuncionario);
			
			if(posicao == null) {
				System.out.println("Esse ID não existe!!");
			} else {
				System.out.println("Digite a porcentagem de aumento do salário: ");
				double porcentagem = sc.nextDouble();
				lista.get(posicao).aumentaSalario(porcentagem);
			}
			
			
			
		}
			
		sc.close();
	}
	
	public static Integer posicaoID (List<Funcionario> lista, int id) {
		for (int i = 0; i < lista.size() ; i++) {
			if (lista.get(i).getIdentidadeDoFuncionario() == id ) {
				return i;
			} else {
				return null;
			}
		} 
	}
}
