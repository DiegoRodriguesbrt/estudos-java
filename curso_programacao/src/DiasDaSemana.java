import java.util.Scanner;


public class DiasDaSemana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual dia da semana?");
		int x = sc.nextInt();
		String diaDaSemana;
		
		switch(x) {
		case 1:
			diaDaSemana = "Domingo";
			break;
		case 2:
			diaDaSemana = "Segunda-Feira";
			break;
		case 3:
			diaDaSemana = "Ter�a-Feira";
			break;
		case 4:
			diaDaSemana = "Quarta-Feira";
			break;
		case 5:
			diaDaSemana = "Quinta-Feira";
			break;
		case 6:
			diaDaSemana = "Sexta-Feira";
			break;
		case 7:
			diaDaSemana = "S�bado";
			break;
		default:
			diaDaSemana = "Dia da semana inv�lido, favor escolher de 1 at� 7 !";
			break;
		}
		System.out.printf("Dia da semana: %s", diaDaSemana);
	}

}
