package comparando.strings;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		String password = "123456";
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite sua senha: ");
		// O operador == compara os endereços de memória, não os valores literários onde estão armazenados
		String pass = scan.nextLine();
		if (password.equals(pass)) {
			System.out.println("Senha correta!");
		} else {
			System.out.println("Senha incorreta!");
		}
		
		String x = new String("123456"); // Um objeto, um espaço de memória alocado
		String y = new String("123456"); // Outro objeto, outro espaço de memória alocado
		
		String g = "123"; // Mesmos espaços de memória
		String k = "123"; // Mesmos espaços de memória
		System.out.println(x == y);
		System.out.println(g == k);
		scan.close();
		
		// Logo, o operador == compara as referências e não os valores das referências.
		
		System.out.println(password.equals(pass)); // Compara o conteúdo das referências
	}

}
