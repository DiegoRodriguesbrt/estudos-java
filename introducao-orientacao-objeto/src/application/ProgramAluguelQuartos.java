package application;

import java.util.Scanner;
import entities.Aluguel;

	public class ProgramAluguelQuartos {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			Aluguel[] vetor = new Aluguel[10];
			
			System.out.println("Quantos quartos serão alugados? ");
			int quantidadeQuartosAlugados = sc.nextInt();
			
			for (int i=0; i < quantidadeQuartosAlugados; i++) {
				sc.nextLine();
				System.out.println();
				System.out.println("Locatário #" + (i+1) + ":");
				System.out.println("Nome: ");
				String nomeDoLocatario = sc.nextLine();
				System.out.println("E-mail: ");
				String emailDoLocatario = sc.nextLine();
				System.out.println("Quarto: ");
				int quarto = sc.nextInt();
				vetor[quarto] = new Aluguel(nomeDoLocatario,emailDoLocatario);
			}
			
			System.out.println();
			System.out.println("Quartos ocupados: ");
			for(int i=0; i<10; i++) {
				if (vetor[i] != null) {
					System.out.println(i + ":" + vetor[i]);
				}
			}
			
			sc.close();
	}
}
