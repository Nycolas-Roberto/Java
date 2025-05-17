package interative.java;

import java.util.Scanner;

public class Interative {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println(nome);
		
		// Tipos não primitivos
		Integer y = 4; // Maior espaço de memório que o tipo primitivo INT, pois podemos realizar mais operações.
		System.out.println(y);
		
		
		// ESCOPO DE VARIÁVEIS
		if(true) {
			int x = 10; // Variável local, válida dentro apenas do If
		}
		
		int k = 10; // Variável local, mas blocos de códigos posteriores podem acessa-la normalmente
		if(true) {
			k = 20;
		}
		System.out.println(k);
	
		final double PI = 3.14159; // Variáveis imutáveis/constantes
		
		
	}

}
