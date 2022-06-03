package application;


import java.util.Scanner;

public class ProgramMatriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de linhas/colunas da matriz: ");
		int numeroLinhasColunas = sc.nextInt();
		
		int[][] matriz = new int[numeroLinhasColunas][numeroLinhasColunas];
		
		for (int i=0; i < matriz.length; i++) {
			for (int j=0; j < matriz[i].length;j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal principal: ");
		
		for (int i = 0; i<numeroLinhasColunas; i++) {
			System.out.println(matriz[i][i]+" ");
		}
		
		int contador = 0;
		for(int i=0; i < matriz.length ;i++) {
			for (int j=0; j<matriz[i].length;j++) {
				if (matriz[i][j] < 0) {
					contador++;
				}
			}
		}
		
		System.out.println("Quantidade números negativos: " + contador);

		sc.close();
		
	}

}
