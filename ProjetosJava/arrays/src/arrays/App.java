package arrays;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		User[] users = new User[10]; /* Declarando Arrays, sendo que o número que colocamos para instanciar um Objeto é a quantidade de espaços alocados que queremos ter */
		// |  |  |  |  |  |  |  |  |  | neste caso temos 10 espaços alocados na memória, sendo de 0 até 9
		System.out.println(users.length);
		for(int cont = 0; cont < users.length; cont++) {
			User actual = new User();
			actual.setFirstname("Nome: " + cont);
			actual.setLastname("Sobrenome: " + cont);
			users[cont] = actual; /* Armazenando um objeto dentro de um array */
		}
		for(int i = 0; i < users.length; i ++) {
			System.out.println(users[i].getFirstname());
			System.out.println(users[i].getLastname());
		}
		
		String[] fruits = new String[10];
		for(int a = 0; a < fruits.length; a++) {
			System.out.println("Nome da fruta número " + a + ":");
			fruits[a] = (String) sc.nextLine();
		}
		for(int c = 0; c < fruits.length; c++) {
			System.out.println("Fruta número "+ c + ": "+ fruits[c]);
		}
		
		int[] numbers = new int[10];
		sc.close();
	}

}
