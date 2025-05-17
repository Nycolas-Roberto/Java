package praticando01;
import java.util.Scanner;

public class Praticando01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Seu Nome: ");
		String nome = input.nextLine();
		System.out.println("Boa noite " + nome);
		
		input.close();
	}

}
