package entities;

public class Aluno {
	public String nomeDoAluno;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double reprovado() {
		if (notaFinal() < 60) {
			return 60 - notaFinal();
		} else {
			return notaFinal();
		}
	}
}
