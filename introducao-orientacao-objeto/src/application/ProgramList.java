package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Diego");
		lista.add("Yasmine");
		lista.add("Helane");
		lista.add("Dorie-Edson");
		lista.add("Hevelyne");
		lista.add(1,"<3");
		
		System.out.println(lista.size());
		
		for (String nome : lista) {
			System.out.println(nome);
		}
		
		System.out.println("--------------------");
				
		System.out.println("Index de Yasmine: " + lista.indexOf("Yasmine"));
		System.out.println("Index de Hevelyne: " + lista.indexOf("Hevelyne"));
		System.out.println("--------------------");
		
		List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'D').collect(Collectors.toList());
		for (String nomes : resultado) {
			System.out.println(nomes);
		}
		
		System.out.println("--------------------");
		
		String primeiroNome = lista.stream().filter(x -> x.charAt(0) == 'D').findFirst().orElse(null);
		System.out.println("Primeiro nome com letra D na lista: " + primeiroNome);
		
		String primeiroNome2 = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println("Procurando nome com letra inicial J: " + primeiroNome2);
	}

}
