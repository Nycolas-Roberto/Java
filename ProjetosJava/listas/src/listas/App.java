package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/* Esses Arrays dinâmicos aceitam apenas tipos genéricos */
		List<User> users = new ArrayList<>(); /* Criar um tipo de Array dinâmico */
		
		int i = 0;
		while (i<10) {
			User actual = new User("Nycolas" + i); /* Instânciamos um objeto utilizando o método construtor */
			users.add(actual); /* Utilizamos o método do próprio java para adicionar algo na lista, no caso não precisamos informar o índice para a lista (array dinâmico) para adicionar um objeto, pois a lista é dinâmica */
			i++;
		}
		
		System.out.println(users.get(9)); /* Usado para pegar os valores dos índices, neste caso é um objeto. Logo irá retornar o endereço de memória onde o objeto está localizado. */
		System.out.println(users.get(9).getFirstname()); /* Agora, indicamos o índice de onde o objeto está armazenado. Logo, tratando-se de um objeto conseguimos obter os métodos do objeto. */
		System.out.println(users.get(3).getFirstname());
		System.out.println(users.size());

		List<String> nomes = new ArrayList<>(); /* Tipo de array dinâmico que armazena Strings */
		int x = 0;
		Scanner sc = new Scanner(System.in);
		while (x < 10) {
			System.out.println("Digite o nome número " + x + ": ");
			String nome = (String) sc.nextLine();
			nomes.add(nome);
			x++;
		}
		for(int f = 0; f < nomes.size(); f++) {
			System.out.println(nomes.get(f));
		}
		sc.close();
	}

}
