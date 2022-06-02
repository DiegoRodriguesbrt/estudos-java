package application;

public class ProgramForEach {
	public static void main(String[] args) {
		
		String[] vetor = new String[] {"Diego", "<3", "Yasmine"};
		
		for (int i=0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		System.out.println("------------------");
		
		for (String nomes : vetor) {
			System.out.println(nomes);
		}
	}
}
