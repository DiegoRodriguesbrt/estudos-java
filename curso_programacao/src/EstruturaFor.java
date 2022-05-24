import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Qual a quantidade de números a ser lido? ");
		 int quantidade = sc.nextInt();
		 int soma = 0;
		 int contador = 0;
		 
		 for (contador = 0; contador < quantidade; contador ++) {
			 System.out.println("Qual número? ");
			 int numero = sc.nextInt();
			 soma += numero;
		 }
		 
		 System.out.printf("A soma foi de %d",soma);
		 sc.close();
				 
	}

}
