package preencherArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
public class App {

	public static void main(String[] args) {
		// Preenchimento de cada índice com laços de repetição
		String[] names = new String[2];
		System.out.println(Arrays.toString(names));
		Scanner input = new Scanner(System.in);
		for(int a = 0; a < names.length; a++) {
			names[a] = (String) input.nextLine();
		}
		for(int b = 0; b < names.length; b++) {
			System.out.println("Nome -> " + names[b]);
		}
		System.out.println(Arrays.toString(names));
		
		// Preenchimento de todos os espaços com um valor padrão
		String[] names2 = new String[2];
		Arrays.fill(names2, "Desconhecido"); //
		System.out.println(Arrays.toString(names2));
		
		
		// Preenchimento com o método do Arraylist
		List<String> namesList = new ArrayList<>();
		namesList.add("Nome 1");
		namesList.add("Nome 2");
		namesList.add("Nome 3");
		namesList.add("Nome 4");
		for(int c = 0; c < namesList.size(); c++) {
			System.out.println(namesList.get(c));
		}
		
		int index = namesList.indexOf("Nome 2"); /* Retorna o número do índice onde se encontra determinado valor dentro da coleção */
		System.out.println(index);
		
		System.out.println(namesList.isEmpty()); // Verifica si a lista está vazia, retornando um valor booleano
		
		System.out.println(namesList.contains("Nome 4")); // Verifica si a lista contém algum elemento
		
		System.out.println(namesList.size()); // Retorna o tamanho da lista
		
		namesList.clear(); // Remove a lista, ou seja, limpa todos os valores da lista
		System.out.println(namesList.isEmpty());
		input.close();
	}

}
