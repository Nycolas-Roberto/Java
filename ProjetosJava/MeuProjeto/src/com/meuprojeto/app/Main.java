package com.meuprojeto.app;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		// Variáveis
		int n1 = 20; // Numeros inteiros
		int n2 = 10; // Numeros inteiros
		
		double altura = 1.80; // Numeros decimais
		char inicial = 'N'; // Unico caracter
		boolean ativo = true; // Valores booleanos (True, False)
		String nome = "Nycolas"; // Valores de caracteres
		
		int media = (n1+n2) / 2;
		if(media >= 15) {
			System.out.println("Aprovado! " + nome + " Sua média -> " + media + " e Inicial: " + inicial);
		} else {
			System.out.println("Reprovado! " + nome + " Sua média -> " + media + " e Inicial: " + inicial);
		}
		
		if(ativo == true) {
			System.out.println("Ativado!" + ativo);
		} else {
			System.out.println("Desativado! " + ativo);
		}
		
		if(altura >= 1.80) {
			System.out.println("Altura aceita! " + altura);
		} else {
			System.out.println("Altura negada! " + altura);
		}
		
		
		int contador = 0;
		while(contador <= 5) {
			System.out.println("Contador: " + contador);
			contador++;
		}
		
		int contador2 = 0;
		do {
			System.out.println("Contador 2 -> " + contador2);
			contador2++;
		} while (contador2 <= 3);
		
		for(int cont3 = 0; cont3<=10; cont3++) {
			System.out.println("Contador 3: " + cont3);
		}
		
		String sobrenome = "Damiani";
		switch(sobrenome) {
			case "Santana":
				System.out.println("Sobrenome -> " + sobrenome);
				break;
			case "Damiani":
				System.out.println("Sobrenome -> " + sobrenome);
				break;
			default:
				System.out.println("Sobrenome não encontrado!");
		}
		
		Date data = new Date();
		System.out.println("Ano: " + data.getYear());
		System.out.println("Mês: " + data.getMonth());
		System.out.println("Dia: "+ data.getDay());
		System.out.println("Horas: " + data.getHours());
		System.out.println("Minutos: " + data.getMinutes());
		System.out.println(data.toString());
		
		
		
	}

}
