package comparando;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		// 1. Comparando arrays
		int[] numbersA = new int[]{1,2,3};
		int[] numbersB = new int[]{1,2,3};
		
		System.out.println(numbersA == numbersB); // Não são iguais, pois estamos comparando o HashCode dos objetos. Não seus valores;
		System.out.println(numbersA.equals(numbersB)); // Também não funcionou, pois novamente estamos comparando o HashCode dos objetos.
		System.out.println("Hashcodes -> " + numbersA + " " + numbersB); // Mostrando os hashcodes dos objetos, pois arrays também são objetos em Java
		
		for(int a = 0; a < numbersA.length; a++) {
			System.out.println(numbersA[a] == numbersB[a]); // Conseguimos comparar os valores de cada um dos índices dessa maneira
		}
		System.out.println(Arrays.equals(numbersA, numbersB)); // Outra forma de comparar os valores dos arrays de forma mais simplificada 
		
		
		numbersB = numbersA; /* Definindo o mesmo Hashcode para os dois, logo, a referência de numbersB não vão apontar para os valores do antigo espaço de memória, e sim para o valores do espaço de memória de numbersA.
		Dessa forma não é certo fazer a comparação */
		System.out.println("Mesmo hashcodes -> " + (numbersA == numbersB));
		
		
	}
	

}
