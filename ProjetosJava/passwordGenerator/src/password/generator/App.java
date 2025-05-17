package password.generator;
import java.util.Random;
import java.util.random.*;

public class App {

	public static void main(String[] args) {
		
	}

	public static void password() {
		Random random = new Random();
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%!";
		int index = random.nextInt(characters.length());
		char randomChar = characters.charAt(index);
		
	}
}
