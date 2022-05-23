import java.util.Scanner;

public class ExercicioNomeCompleto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome, sobrenome, ultimoNome;
		
		System.out.println("Digite o seu primeiro nome: ");
		nome = sc.nextLine();
		
		System.out.println("Digite o seu sobrenome: ");
		sobrenome = sc.nextLine();
		
		System.out.println("Digite o último nome: ");
		ultimoNome = sc.nextLine();
		
		System.out.printf("O nome completo digitado foi: %s %s %s", nome, sobrenome, ultimoNome);		
		
		sc.close();
	
	}
}
