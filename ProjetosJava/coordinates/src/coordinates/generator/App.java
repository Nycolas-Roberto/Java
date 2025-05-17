package coordinates.generator;
import java.util.Random;

public class App {
	/*|\*/
	/* Não devemos gerar o Y pois corremos risco de nascer no céu ou de baixo da terra no minecraft */
	public static void main(String[] args) {
		if(args[0].length() > 0) {
			System.out.println("[-] Select a option from generate:\n= [Long] Distance\n= [Medium] Distance\n= [Short] Distance");	
			generate(args[0]);
		} else {
			System.out.println("[!] You need a information a execute the code! (Long, Medium, Short)");
		}
	}
	
	public static void generate(String option) {
		Random random = new Random();
		switch (option) {
			case "Long":
				int long_x = (int) random.nextInt(-29000000, 29000001);
				int long_z = (int) random.nextInt(-29000000, 29000001);
				System.out.println("XZ: "+long_x+"; "+long_z);
				break;
			case "Medium":
				int medium_x = (int) random.nextInt(-290000, 290001);
				int medium_z = (int) random.nextInt(-290000, 290001);
				System.out.println("XZ: "+medium_x+"; "+medium_z);
				break;
			case "Short":
				int short_x = (int) random.nextInt(-29000, 29001);
				int short_z = (int) random.nextInt(-29000, 29001);
				System.out.println("XZ: "+short_x+"; "+short_z);
				break;
			default:
				int x = (int) random.nextInt(-2900, 2901);
				int z = (int) random.nextInt(-2900, 2901);
				System.out.println("XZ: "+x+"; "+z);
		}
	}
}
