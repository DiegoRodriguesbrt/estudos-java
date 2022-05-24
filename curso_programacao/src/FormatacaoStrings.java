
public class FormatacaoStrings {
	
	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG     ";
		System.out.printf("Original: %s %n",original);
		
		String s01 = original.toLowerCase();
		System.out.printf("Tudo minúsculo: %s %n",s01);
		
		String s02 = original.toUpperCase();
		System.out.printf("Tudo maíusculo: %s %n",s02);
		
		String s03 = original.trim();
		System.out.printf("Original sem espaço antes e depois da última letra: %s %n", s03);
		
		String s04 = original.substring(2);
		System.out.printf("Original a partir do 2 índice: %s %n",s04);
		
		String s05 = original.substring(2,9);
		System.out.printf("Original a partir do 2 índice até o 9 índice: %s %n",s05);
	
		String s06 = original.replace('a', 'x');
		System.out.printf("Original trocando letra A por X: %s %n",s06);
		
		String s07 = original.replace("abc", "xy");
		System.out.printf("Original trocando abc por xy: %s %n",s07);
	
		String frutas = "Maça Banana Laranja";
		String[] vetorString = frutas.split(" ");
		
		String word1 = vetorString[0];
		System.out.println(word1);
		
		String word2 = vetorString[1];
		System.out.println(word2);
		
		String word3 = vetorString[2];
		System.out.println(word3);
	
	
	}
}
