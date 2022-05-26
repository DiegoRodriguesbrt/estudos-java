package application;

import entities.Aluno;
import java.util.Scanner;
import java.util.Locale;

public class ProgramAlunoNota {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome do aluno: ");
		aluno.nomeDoAluno = sc.nextLine();
		
		System.out.println("Digite a nota do 1 Trimestre: ");
		aluno.nota1 = sc.nextDouble();
		
		System.out.println("Digite a nota do 2T: ");
		aluno.nota2 = sc.nextDouble();
		
		System.out.println("Digite a nota do 3T: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("Nota final: %.2f %n", aluno.notaFinal());
		
		if ((aluno.notaFinal() >= 0) && (aluno.notaFinal() < 60)) {
			System.out.println("REPROVADO");
			System.out.printf("Faltaram %.2f pontos para ser aprovado!", aluno.reprovado());
		} else if (aluno.notaFinal() >=60 && aluno.notaFinal() <= 100) {
			System.out.println("APROVADO");
		} else {
			System.out.println("Digite notas válidas!");
		}
	}
}
