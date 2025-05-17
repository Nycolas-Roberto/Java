package packages.imports;

public class User {
	public static void logar(String nome, String senha) {
		if(nome == "nycolas" || senha == "senha123") {
			System.out.println("Logado com sucesso!");
		} else {
			System.out.println("Nome ou senha incorretas!");
		}
	}
}
